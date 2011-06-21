package org.oldcode.freemarker.standalone_test;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
    	System.out.println("start...");
    	
        /* ------------------------------------------------------------------- */    
        /* You should do this ONLY ONCE in the whole application life-cycle:   */    
    
        /* Create and adjust the configuration */
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(new File("/home/wise/data/workspace/standalone_test/templates"));
        cfg.setObjectWrapper(new DefaultObjectWrapper());

        /* ------------------------------------------------------------------- */    
        /* You usually do these for many times in the application life-cycle:  */    
                
        /* Get or create a template */
        Template temp = cfg.getTemplate("test.ftl");

        /* Create a data-model */
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("user", "Big Joe");
        Map<String, String> latest = new HashMap<String, String>();
        root.put("latestProduct", latest);
        latest.put("url", "products/greenmouse.html");
        latest.put("name", "green mouse");

        /* Merge data-model with template */
        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);
        out.flush();
        
    	System.out.println("...stop");
    }
}  









