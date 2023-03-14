package Problem_4;

import java.util.ArrayList;

public class Driver{
    
    public static void main(String[] args){
        
        // Instantiate Folder and File objects
        ArrayList<Object> php_demo1_folder_contents = new ArrayList<Object>();
        Folder php_demo1 = new Folder("php_demo1", php_demo1_folder_contents);
        ArrayList<Object> source_files_folder_contents = new ArrayList<Object>();
        Folder source_files = new Folder("Source Files", source_files_folder_contents);
        ArrayList<Object> phalcon_folder_contents = new ArrayList<Object>();
        Folder phalcon = new Folder(".phalcon", phalcon_folder_contents);
        ArrayList<Object> app_folder_contents = new ArrayList<Object>();
        Folder app = new Folder("app", app_folder_contents);
        ArrayList<Object> config_folder_contents = new ArrayList<Object>();
        Folder config = new Folder("config", config_folder_contents);
        ArrayList<Object> controllers_folder_contents = new ArrayList<Object>();
        Folder controllers = new Folder("controllers", controllers_folder_contents);
        ArrayList<Object> library_folder_contents = new ArrayList<Object>();
        Folder library = new Folder("library", library_folder_contents);
        ArrayList<Object> migrations_folder_contents = new ArrayList<Object>();
        Folder migrations = new Folder("migrations", migrations_folder_contents);
        ArrayList<Object> models_folder_contents = new ArrayList<Object>();
        Folder models = new Folder("models", models_folder_contents);
        ArrayList<Object> views_folder_contents = new ArrayList<Object>();
        Folder views = new Folder("views", views_folder_contents);
        ArrayList<Object> cache_folder_contents = new ArrayList<Object>();
        Folder cache = new Folder("cache", cache_folder_contents);
        ArrayList<Object> public_folder_contents = new ArrayList<Object>();
        Folder public_folder = new Folder("public", public_folder_contents);
        File htaccess = new File(".htaccess");
        File htrouter_php = new File(".htrouter.php");
        File index_html = new File("index.html");
        ArrayList<Object> include_path_folder_contents = new ArrayList<Object>();
        Folder include_path = new Folder("Include Path", include_path_folder_contents);
        ArrayList<Object> remote_files_folder_contents = new ArrayList<Object>();
        Folder remote_files = new Folder("Remote Files", remote_files_folder_contents);

        // Recreate folder structure
        php_demo1_folder_contents.add(source_files);
        php_demo1_folder_contents.add(include_path);
        php_demo1_folder_contents.add(remote_files);
        source_files_folder_contents.add(phalcon);
        source_files_folder_contents.add(app);
        source_files_folder_contents.add(cache);
        source_files_folder_contents.add(public_folder);
        source_files_folder_contents.add(htaccess);
        source_files_folder_contents.add(htrouter_php);
        source_files_folder_contents.add(index_html);
        app_folder_contents.add(config);
        app_folder_contents.add(controllers);
        app_folder_contents.add(library);
        app_folder_contents.add(migrations);
        app_folder_contents.add(models);
        app_folder_contents.add(views);

        System.out.println("1. Print the full structure:\n");
        php_demo1.printFolderContents(php_demo1, 0);
        
        php_demo1.resetVisited(php_demo1);

        System.out.println("\n2. Delete the folder app and print out the full structure:\n");
        php_demo1.deleteFolder(php_demo1, "app");
        php_demo1.printFolderContents(php_demo1, 0);
        
        php_demo1.resetVisited(php_demo1);

        System.out.println("\n3. Delete the folder public and print out the full structure:\n");
        php_demo1.deleteFolder(php_demo1, "public");
        php_demo1.printFolderContents(php_demo1, 0);
        
    }

}