package [Package]

import [Main chemin]

import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;


public class Config extends ConfigFile {
    public Config(Main main) {
        super(main, "config.yml");
    }

    // Configurations
    public static String NameString;

    // Initialisation
    protected void loadConfigurations(List<Configuration> configurations, YamlConfiguration config) {
        NameString = (String) new Configuration("Nom", "Values", configurations, config).getValue();
    }
}
