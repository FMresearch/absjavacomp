/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absjavacomp;
import ABS.Absyn.*;
import abs.api.Actor;
import abs.api.Configuration;
import abs.api.Context;
import abs.api.DispatchInbox;
import abs.api.LocalContext;
import abs.api.Reference;
//import abs.api.Reference;
//import java.net.URI;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java_cup.runtime.*;
//import ABS.*;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//import java.util.AbstractCollection;
//import absjavacomp.Traverse;
//import ABS.gen.java.ABS.Absyn.*;
//import ABS.gen.java.ABS.*;
//import ABS.gen.java.lib.JLex.*;
//import java.io.IOException;
//import java.io.File;
/**
 *
 * @author chetan
 */
public class Absjavacomp extends Traverse implements Actor {

    
    private final Traverse traverse = new Traverse();
    /**
     * @param args the command line arguments
     */
     
    /** The context. Required by the actors to invoke methods. */
	// copy paste this to use the ABS API into the code(configuration settings)
	private static final Configuration config = Configuration
			.newConfiguration()
       
                
                .withInbox(new DispatchInbox(Executors.newWorkStealingPool()))
			.build();
	private final Context context = new LocalContext(config);   

                 
        public static void main(String[] args) {
        // TODO code application logic here
 //Required to access the front end path
      
       
   
    
    }
}
    
    
