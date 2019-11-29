package rekenen;

import org.w3c.dom.ls.LSOutput;
import rekenen.plugins.Plugin;

/**
 * PEER TUTORING
 * P2W3
 */
public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
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
            Plugin plugin = getPluginViaCommando(command);
            return plugin.bereken(x,y);
        } else {
            System.out.println("Het commando bestaat niet!");
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

    public Plugin getPluginViaCommando(String commando) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].getCommand().equals(commando)) {
                return ingeladenPlugins[i];
            }
        }
        return null;
    }
}
