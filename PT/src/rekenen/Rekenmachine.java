package rekenen;

import org.w3c.dom.ls.LSOutput;
import rekenen.plugins.Plugin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * PEER TUTORING
 * P2W3
 */
public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;
    private StringBuilder logOfCalculations;

    public Rekenmachine() {
        ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        aantalPlugins = 0;
    }

    public void installeer(Plugin teInstallerenPlugin) {
        if (controleerBestaandePlugin(teInstallerenPlugin.getCommand())) {
            System.out.println("De plugin zit al in de lijst!");
        } else if (aantalPlugins < 10) {
            ingeladenPlugins[aantalPlugins++] = teInstallerenPlugin;
        } else {
            System.out.println("De lijst zit vol!");
        }
    }

    public double bereken(String command, double x, double y) {
        if (controleerBestaandePlugin(command)) {
            Plugin plugin = getPluginViaCommand(command);
            return plugin.bereken(x, y);
        } else {
            System.out.printf("Plugin %s niet geinstalleerd!\n", command);
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Geinstalleerde plugins");
        for (int i = 0; i < aantalPlugins; i++) {
            sb.append(" ").append(ingeladenPlugins[i].getCommand());
        }
        return sb.toString();
    }

    public boolean controleerBestaandePlugin(String command) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].getCommand().equals(command)) {
                return true;
            }
        }
        return false;
    }

    public Plugin getPluginViaCommand(String command) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].getCommand().equals(command)) {
                return ingeladenPlugins[i];
            }
        }
        return null;
    }

    public void addCalcToLog (String berekeningAlsString) {
        logOfCalculations.append(berekeningAlsString).append("\n");
    }

    public void addDateToLog() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        logOfCalculations.append(myFormat.format(now));
    }

    public String getLog() {
        logOfCalculations.append("==== LOG ====");
        return logOfCalculations.toString();
    }
}
