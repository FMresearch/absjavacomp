/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absjavacomp;
//import ABS.gen.java.ABS.Absyn.*;
import abs.api.Actor;
import abs.api.Configuration;
import abs.api.Context;
import abs.api.DispatchInbox;
import abs.api.LocalContext;
//import ABS.gen.java.ABS.*;
//import ABS.gen.java.lib.JLex.*;
//import java.util.List;
import java.util.concurrent.Executors;
import ABS.Absyn.*;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.RunnableFuture;
//import java.util.concurrent.Callable;
//import javax.management.openmbean.SimpleType;
import java.util.function.*;

/**
 *
 * @author chetan
 */
public class Traverse implements Actor
{
    /** The context. Required by the actors to invoke methods. */
	// copy paste this to use the ABS API into the code(configuration settings)
	private final Configuration config = Configuration.newConfiguration()
			.withInbox(new DispatchInbox(Executors.newWorkStealingPool()))
			.build();
	private final Context context = new LocalContext(config);
        
        //Traversing in each of the modules from the ABS module
     public class AnyIdentVisitor<R,A> implements AnyIdent.Visitor<R,A>
  {
      
// after implements the AnyIdent.visitor<R,A) are the functional interfaces 
         //for the class AnyIdentVisitor<R,A>
// each non terminal becomes a JAVA method in the skeleton
      // R is the java output
      // ABS is the input
      // A is just the string or argument
      // p is the object,should not be in the return value
               
        
         /**
          *
          * @param p
          * @param arg
          * @return
          */
        
    @Override
    public R visit(ABS.Absyn.AnyIden p, A arg)
    {
      /* Code For AnyIden Goes Here */
         //using lambdas expression 
      
    AnyIden refer = new AnyIden();
    refer.equals(p);
    refer.hashCode();
    refer.accept(this, arg);
    return this.visit(p, arg);
    
    //String x ;
    //x = (R,A)-> {return this.visit((R,A) -> { return x;});
    //commented out as I need to reimplement all the methods within the interfaces using lambda expressios
    // by declaring it as default methods or creating separate interfaces for each method for the existing method
//String AnyIdent ;
    //AnyIdent = (p,A) -> { return this.visit((p,A) -> {return x;});   
    //}
        
       //to write in lambda expression
       //(ABS.Absyn.AnyIden p, A arg) -> {p.lident_.visit();}
        //return null;
    }
         
    
    @Override
    public R visit(ABS.Absyn.AnyTyIden p, A arg)
    {
        AnyTyIden coresp = new AnyTyIden();
        coresp.equals(p);
    coresp.hashCode();
    coresp.accept(this, arg);
    return this.visit(p, arg);
     //String AnyTyIden ;
    //AnyTyIden = (p,A)-> {return this.visit((p,A) -> { return AnyTyIden;});
      /* Code For AnyTyIden Goes Here */

      //p.typeident_;
         
        //Java.TypeIdent y = p.typeident_.visit();
       // return this.visit(p, arg);
	//p1 -> {return uident_;}	//return (new Java.AnyTyIden (p.typeident_));
        
  }
    //@Override
    //private interface AnyIdent.Visitor<R,A> extends AnyIdentVisitor<R,A> { 
    //    default public R visit(ABS.Absyn.AnyIden p, A arg);        
    //}
    
     }
     
     
    //Program (Entrypoints)
//////   // entry point code for visiting different module
//////   // visiting modules and returning the object to the parent node
//////   //Node 2
//////   // completed
public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
{
    
@Override
public R visit(ABS.Absyn.Prog p, A arg)
    {
        Prog resp = new Prog();
        resp.equals(p);
        resp.hashCode();
        resp.accept(this, arg);
        return this.visit(p, arg);
    }
}
        //p1 -> {return listmodule_;}                
//////      /* Code For Prog Goes Here 
//////	List<Amod> ms = empty();
//////      for (Module x : p.listmodule_) {
//////	  Amod m = x.visit();
//////          ms.append(m);
//////      }
//////
//////      return ms;
//////    }*/
//////
//////  }
//////   }
//Modules(export&impor&declartions)
//////    //Node 3:
//////    // completed
public class ModuleVisitor<R,A> implements Module.Visitor<R,A>
  {
//////       /* Code For Module Goes Here */
//////   
@Override
public R visit(ABS.Absyn.Modul p, A arg)
{
        Modul mesp = new Modul();
        mesp.equals(p);
        mesp.hashCode();
        mesp.accept(this, arg);
        return this.visit(p, arg);
}
}
//////	  R x = p.type_.visit();
//////                
//////      /* Code For Module Goes Here */
//////        List<Rexp> es = empty();
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      for (Export x : p.listexport_) {
//////	  Rexp i = x.visit();
//////          es.append(i);
//////      }
//////     
//////   
//////      /* Code For Module Goes Here */
//////        List<JavaImport> is = empty();
//////      for (Import y : p.listimport_) {
//////	  Java.Import n = y.visit();
//////          is.append(n);
//////      }
//////     
//////    
//////      /* Code For Module Goes Here */
//////        List<JavaDecl> ds = empty();
//////      for (Decl z : p.listdecl_) {
//////	  Java.Decl r = z.visit();
//////	  ds.append(r);
//////       }
//////      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
//////
//////      return new Java.Module (x,es,is,ds);
//////      }
//////  }
//////     
//////
//////      // return ds;
//////      // return as;
//////      // return es;
//////      // return object what should be returned(as there are list of modules) not      //sure check with Behrooz
//////    
//////  
// Exports()
//////    //Node 4
//////    //Completed
public class ExportVisitor<R,A> implements Export.Visitor<R,A>
{

    @Override
    public R visit(ABS.Absyn.AnyExport p, A arg)
{
    AnyExport pesp = new AnyExport();
        pesp.equals(p);
        pesp.hashCode();
        pesp.accept(this, arg);
        return this.visit(p, arg);
}
//////      /* Code For AnyExport(AnyIdent) Goes Here */
//////	List<JavaAnyIdent> es = empty;
//////      for (AnyIdent x : p.listanyident_) {
//////	  Java.AnyIden i = x.visit();
//////          es.append(i);
//////      }
//////
//////      return es ;
//////    }
//////    
////// /* Code For AnyFromExport Goes Here */
    @Override
 public R visit(ABS.Absyn.AnyFromExport p, A arg)
 {
      AnyFromExport fesp = new AnyFromExport();
        fesp.equals(p);
        fesp.hashCode();
        fesp.accept(this, arg);
        return this.visit(p, arg);
 }
//////      /* Code For AnyFromExport Goes Here */
//////	List<JavaAnyIdent> es = empty;
//////          for (AnyIdent x : p.listanyident_) {
//////	  Java.AnyIden i = x.visit();
//////          es.append(i);
//////           }
//////
//////	  Java.Type x = p.type_.visit();
//////      // p.type_.accept(new TypeVisitor<R,A>(), arg);
//////
//////      //return (Java.AnyFromExport (p.type_.accept( )));
//////      // cross verify with Behrooz and Nikolaous
//////	  // return (Java.AnyFromExport (p.export(anyident_(type_))));
//////	  return new Java.AnyFromExport(es, x);
//////    }
//////

//////           /* Code For AnyFromExport(type) Goes Here */
//////	  Java.Type n = p.type_.visit();
//////          return n;
//////      }
//////
    @Override
    public R visit(ABS.Absyn.StarExport p, A arg)
{
     StarExport rexp = new StarExport();
        rexp.equals(p);
        rexp.hashCode();
        rexp.accept(this, arg);
        return this.visit(p, arg);
}
//////      /* Code For StarExport Goes Here */
//////        
//////	return null;
//////    }
    @Override
    public R visit(ABS.Absyn.StarFromExport p, A arg)
{
        StarFromExport pesp = new StarFromExport();
        pesp.equals(p);
        pesp.hashCode();
        pesp.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For StarFromExport Goes Here */
//////
//////	// p.type_.accept(new TypeVisitor<R,A>(), arg);
//////
//////      // for(StarFromExport x : p.ExportVisitor(TypeVisitor)){
//////      //  Java.StarFromExport i = x.visit();
//////      // }
//////
//////	Java.Type x = p.type_.visit();
//////        return x;
//////    }
//////
//////  }
//////    // Imports()
//////    //Node 5
//////    //Completed
public class ImportVisitor<R,A> implements Import.Visitor<R,A>
 {
    @Override
    public R visit(ABS.Absyn.AnyImport p, A arg)
    {
        AnyImport iesp = new AnyImport();
        iesp.equals(p);
        iesp.hashCode();
        iesp.accept(this, arg);
        return this.visit(p, arg);
    }
//////    {
//////      /* Code For AnyImport(ImportType) Goes Here */
//////	
//////      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      p.anyident_.accept(new AnyIdentVisitor<R,A>(), arg);
//////         
//////      //For importtype
//////      Java.ImportType n = p.importtype_.visit();
//////      return n;
//////    
//////      // cannot return all values as seen below.put an inner class and use left & right method techniques for returning values
//////     
//////      // return (Java.AnyImport (p.importtype_(type_(anyident_))));
//////      //  return p.importtype_(type_(listany
//////    }
//////
//////    // for Type
//////   public Java.Type visit(ABS.Absyn.AnyImport p, A arg)
//////    {
////// /* Code For AnyImport(Type) Goes Here */
//////	Java.Type x= p.type_.visit();
//////        return x;
//////    }
//////
//////    public Java.AnyIdent visit(ABS.Absyn.AnyImport p, A arg)
//////    {
////// /* Code For AnyImport(anyident) Goes Here */
//////	Java.AnyIdent x= p.anyident_.visit();
//////        return x;
//////    }
//////
    @Override
    public R visit(ABS.Absyn.AnyFromImport p, A arg)
{
     AnyFromImport fimo = new AnyFromImport();
        fimo.equals(p);
        fimo.hashCode();
        fimo.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For AnyFromImport Goes Here */
//////	//Need to change from here according to the new method
//////
//////	Java.ImportType x =p.importtype_.visit();
//////        return x;
//////    }
//////   
//////    public List<JavaAnyIdent> visit(ABS.Absyn.AnyFromImport p, A arg)
//////    {
//////	List<JavaAnyIdent> es = empty();
//////        p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
//////      for (AnyIdent x : p.listanyident_) {
//////	  Java.AnyIden i = x.visit();
//////          es.append(i);
//////      }
//////      return es;
//////    }
//////
//////    public Java.Type visit(ABS.Absyn.AnyFromImport p, A arg)
//////    {
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      Java. Type x =p.type_.visit();
//////      return x;
//////    }
//////     
//////    
    @Override
    public R visit(ABS.Absyn.StarFromImport p, A arg)
{
     AnyExport sfim = new AnyExport();
        sfim.equals(p);
        sfim.hashCode();
        //sfim.accept(this, arg);
        return this.visit(p, arg);
}
}
//////      /* Code For StarFromImport Goes Here */
//////
//////      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      Java.ImportType x =p.importtype_.visit();
//////      return x;
//////    }
//////
//////  }
// Import Types(Not part of Imports)
//////    //Node 6
//////    //Completed
public class ImportTypeVisitor<R,A> implements ImportType.Visitor<R,A>
{
 @Override
 public R visit(ABS.Absyn.ForeignImport p, A arg)
{
      ForeignImport fimp = new ForeignImport();
        fimp.equals(p);
        fimp.hashCode();
        fimp.accept(this, arg);
        return this.visit(p, arg);
}

        @Override
        public R visit(NormalImport p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
}
               
            
//////      /* Code For ForeignImport Goes Here */
//////
//////        //did not find fimporttype_ check with Behrooz and Nikolaous
//////	Java.fimport r = p.importtype_.visit();
//////        return r;
//////    }
//////    // this method not sure.keep it at last.
//////    public Java.import visit(ABS.Absyn.NormalImport p, A arg)
//////    {
//////      /* Code For NormalImport Goes Here */
//////
//////        Java.import r = p.importtype_.visit();
//////	return r;
//////    }
//////
//////  }
//Type valid names
//////    //Node 7
//////    //completed
/*
public class TypeVisitor<R,A> implements Type.Visitor<R,A>
{
public R visit(ABS.Absyn.UnderscoreType p, A arg)
{
        UnderscoreType uimp = new UnderscoreType();
        uimp.equals(p);
        uimp.hashCode();
        //fimp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For UnderscoreType Goes Here */
//////
//////	return null;
//////        }
//public R visit(ABS.Absyn.SimpleType p, A arg)
/*{
        SimpleType simp = new SimpleType();
        simp.equals(p);
        simp.hashCode();
        //fimp.accept(this, arg);
        return this.visit(p, arg);
//}
//////      /* Code For SimpleType Goes Here */
//////	 List<JavaQualTypeIdent> ms = empty();
//////      for (QualTypeIdent x : p.listqualtypeident_) {
//////	  Java.SimpleType i = x.visit();
//////	   ms.append(i);
//////      }
//////
//////      return ms;
//////    }
//public R visit(ABS.Absyn.ParType p, A arg)
/*{
        ParType paimp = new ParType();
        paimp.equals(p);
        paimp.hashCode();
        //fimp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ParType Goes Here */
//////	List<JavaQualTypeIdent> ms = empty();
//////      for (QualTypeIdent x : p.listqualtypeident_) {
//////           Java.ParType i = x.visit();
//////           ms.append(i);
//////      }
//////      return ms;
//////    }
//////    public List<JavaType> visit(ABS.Absyn.ParType p , A arg)
//////    {
//////      List<JavaType> ms =empty();
//////       for (Type x : p.listtype_) {
//////	  Java.ParType i = x.visit();
//////          ms.append(i);
//////      }
//////       return ms;
//////    }
//////
//////  }
//////    //list wrapper TypeIdentifiers
//////    //Node 8
//////    //Completed
//////  public class QualTypeIdentVisitor<R,A> implements QualTypeIdent.Visitor<R,A>
//////  {
//////    public Java.TypeIdent visit(ABS.Absyn.QualTypeIden p, A arg)
//////    {
//////      /* Code For QualTypeIden Goes Here */
//////
//////      //p.typeident_;
//////        Java.TypeIdent r = p.typeident_.visit();
//////	return r ;
//////    }
//////
//////  }
// Declarationsall(all comes under this main declaration visitor class wih     //methods for ADT,fucntions, interfaces and classes)
//////    //Node 9
public class DeclVisitor<R,A> implements Decl.Visitor<R,A>
{
@Override
public R  visit(ABS.Absyn.TypeDecl p, A arg)
 { 
        TypeDecl dimp = new TypeDecl();
        dimp.equals(p);
        dimp.hashCode();
        dimp.accept(this, arg);
        return this.visit(p, arg);
 }
//////      /* Code For TypeDecl Goes Here */
//////
//////      //p.typeident_;
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      Java.TypeIdent r = p.typeident_.visit();
//////
//////      return r;
//////    }
//////    /// added an extra method for the type syntax
//////
//////    /// check with nikolaos is it required or not
//////    public Java.Type visit(ABS.Absyn.TypeDecl p, A arg)
//////    {
//////	Java.Type r = p.type_.visit();
//////        return r;
//////    }
//////
@Override
public R visit(ABS.Absyn.DataDecl p, A arg)
{
        DataDecl dadc = new DataDecl();
        dadc.equals(p);
        dadc.hashCode();
        dadc.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
/////      /* Code For DataDecl Goes Here */
//////
//////      //p.typeident_;
//////	List<JavaConstrIdent> ms = empty();
//////      for (ConstrIdent x : p.listconstrident_) {
//////	  Java.DataDecl i = x.visit();
//////          ms.append(i);
//////      }
//////
//////      return ms;
//////    }
//////    public Java.TypeIdent visit(ABS.Absyn.DataParDecl p, A arg)
//////    {
//////      /* Code For DataParDecl Goes Here */
//////
//////	Java.TypeIdent i = p.typeident_.visit();
//////        return i;
//////    }
//////   
//////    public List<TypeIdent> visit(ABS.Absyn.DataParDecl p, A arg)
//////    {
//////	List<TypeIdent> ms = empty;
//////      //p.typeident_;
//////      for (TypeIdent x : p.listtypeident_) {
//////	  Java.TypeIdent i = x.visit();
//////          ms.append(i);
//////      }
//////      return ms;
//////    }
//////
//////    public List<ConstrIdent> visit(ABS.Absyn.DataParDecl p, A arg)
//////    {
//////	List<ConstrIdent> ms = empty;
//////      for (ConstrIdent x : p.listconstrident_) {
//////          Java.ConstrIdent i = x.visit();
//////          ms.append(i);      
//////    }
//////
//////      return ms;
//////    }
@Override
public R visit(ABS.Absyn.FunDecl p, A arg)
{
        FunDecl fdcl = new FunDecl();
        fdcl.equals(p);
        fdcl.hashCode();
        fdcl.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For FunDecl Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      List<JavaParam> ms = empty;
//////      for (Param x : p.listparam_) {
//////	  Java.Param i = x.visit();
//////          ms.append(i);
//////      }
//////        return ms;
//////      p.funbody_.accept(new FunBodyVisitor<R,A>(), arg);
//////    }
@Override
public R visit(ABS.Absyn.FunParDecl p, A arg)
{
    FunParDecl fpdimp = new FunParDecl();
        fpdimp.equals(p);
        fpdimp.hashCode();
        fpdimp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For FunParDecl Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (String x : p.listtypeident_) {
//////      }
//////      for (Param x : p.listparam_) {
//////      }
//////      p.funbody_.accept(new FunBodyVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.InterfDecl p, A arg)
{
        InterfDecl itdc = new InterfDecl();
        itdc.equals(p);
        itdc.hashCode();
        itdc.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For InterfDecl Goes Here */
//////
//////      //p.typeident_;
//////      for (MethSignat x : p.listmethsignat_) {
//////      }
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.ExtendsDecl p, A arg)
{
    ExtendsDecl eimp = new ExtendsDecl();
        eimp.equals(p);
        eimp.hashCode();
        eimp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ExtendsDecl Goes Here */
//////
//////      //p.typeident_;
//////      for (Type x : p.listtype_) {
//////      }
//////      for (MethSignat x : p.listmethsignat_) {
//////      }
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.ClassDecl p, A arg)
{
    ClassDecl cimp = new ClassDecl();
        cimp.equals(p);
        cimp.hashCode();
        cimp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ClassDecl Goes Here */
//////
//////      //p.typeident_;
//////      for (ClassBody x : p.listclassbody_1) {
//////      }
//////      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
//////      for (ClassBody x : p.listclassbody_2) {
//////      }
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.ClassParamDecl p, A arg)
{
    ClassParamDecl cpdimp = new ClassParamDecl();
        cpdimp.equals(p);
        cpdimp.hashCode();
        cpdimp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ClassParamDecl Goes Here */
//////
//////      //p.typeident_;
//////      for (Param x : p.listparam_) {
//////      }
//////      for (ClassBody x : p.listclassbody_1) {
//////      }
//////      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
//////      for (ClassBody x : p.listclassbody_2) {
//////      }
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.ClassImplements p, A arg)
{
    ClassImplements cmp = new ClassImplements();
        cmp.equals(p);
        cmp.hashCode();
        cmp.accept(this, arg);
        return this.visit(p, arg);
        //return this.visit(p, arg)
}
//////    {
//////      /* Code For ClassImplements Goes Here */
//////
//////      //p.typeident_;
//////      for (Type x : p.listtype_) {
//////      }
//////      for (ClassBody x : p.listclassbody_1) {
//////      }
//////      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
//////      for (ClassBody x : p.listclassbody_2) {
//////      }
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.ClassParamImplements p, A arg)
{
        ClassParamImplements cpims = new ClassParamImplements();
        cpims.equals(p);
        cpims.hashCode();
        cpims.accept(this, arg);
        return this.visit(p, arg);
        //return this.visit(p, arg)
}

        @Override
        public R visit(TypeParDecl p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public R visit(ExceptionDecl p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public R visit(DataParDecl p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

                
}
//////    {
//////      /* Code For ClassParamImplements Goes Here */
//////
//////      //p.typeident_;
//////      for (Param x : p.listparam_) {
//////      }
//////      for (Type x : p.listtype_) {
//////      }
//////      for (ClassBody x : p.listclassbody_1) {
//////      }
//////      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
//////      for (ClassBody x : p.listclassbody_2) {
//////      }
//////
//////      return null;
//////    }
//////
//////  }
//////    // SingleConstrIdent(ADT) is there in declarations
//////    //Node 10
//////    // in progress...
public class ConstrIdentVisitor<R,A> implements ConstrIdent.Visitor<R,A>

{
@Override
public R visit(ABS.Absyn.SinglConstrIdent p, A arg)
{
        SinglConstrIdent scmp = new SinglConstrIdent();
        scmp.equals(p);
        scmp.hashCode();
        scmp.accept(this, arg);
        return this.visit(p, arg);
        //return this.visit(p, arg)
}
//////    {
//////      /* Code For SinglConstrIdent Goes Here */
//////
//////      //p.typeident_;
//////
//////	return (Java.SinglConstrIdent (p.typeident_));
//////    }
@Override
public R visit(ABS.Absyn.ParamConstrIdent p, A arg)
{
    ParamConstrIdent pcid = new ParamConstrIdent();
        pcid.equals(p);
        pcid.hashCode();
        pcid.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For ParamConstrIdent Goes Here */
//////
//////      //p.typeident_;
//////      for (ConstrType x : p.listconstrtype_) {
//////	  Java.ConstrType i = x.visit();
//////      }
//////
//////      return (Java.ParamConstrIdent (p.typeident_(listconstrtype_)));
//////    }
//////
//////  }
//Declaration(Types)
//////    //Node 10
public class ConstrTypeVisitor<R,A> implements ConstrType.Visitor<R,A>
{
@Override
public R visit(ABS.Absyn.EmptyConstrType p, A arg)
{
        EmptyConstrType eict = new EmptyConstrType();
        eict.equals(p);
        eict.hashCode();
        eict.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EmptyConstrType Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      Java.Type r = p.type_.visit();
//////      return r;
//////    }
@Override
public R visit(ABS.Absyn.RecordConstrType p, A arg)
{
        RecordConstrType rct = new RecordConstrType();
        rct.equals(p);
        rct.hashCode();
        rct.accept(this, arg);
        return this.visit(p, arg);
}

}
//////    {
//////      /* Code For RecordConstrType Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      Java.TypeIdent r = p.type_.visit();
//////      return r;
//////    }
//////
//////    public Java.Ident visit(ABS.Absyn.RecordConstrType p, A arg)
//////    {
//////	Java.Ident r = p.ident_.visit();
//////        return r ;
//////    }
//////
//////  }
//declarations(Built &Normal)
//////    //Node 11
public class FunBodyVisitor<R,A> implements FunBody.Visitor<R,A>
{
@Override
public R visit(ABS.Absyn.BuiltinFunBody p, A arg)
{
        BuiltinFunBody bufb = new BuiltinFunBody();
        bufb.equals(p);
        bufb.hashCode();
        bufb.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For BuiltinFunBody Goes Here */
//////
//////
//////	//Check with Behrooz. not sure with builtin method for ABS
//////	//return (Java.BuiltinFunBody (p.Built);
//////    }
@Override
public R visit(ABS.Absyn.NormalFunBody p, A arg)
{
        NormalFunBody nofb = new NormalFunBody();
        nofb.equals(p);
        nofb.hashCode();
        nofb.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For NormalFunBody Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return (Java.NormalFunBody (p.pureexp_));
//////    }
//////
//////  }
//Declarations(MethodsignatVisitor)
//////    //Node 12
public class MethSignatVisitor<R,A> implements MethSignat.Visitor<R,A>
{
@Override
public R visit(ABS.Absyn.MethSig p, A arg)
{
        MethSig mesi = new MethSig();
        mesi.equals(p);
        mesi.hashCode();
        mesi.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For MethSig Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (Param x : p.listparam_) {
//////	  Java.Param i = x.visit();
//////      }
//////
//////      return (Java.MethSig (p.typeident_(listparam_)));
//////    }
//////
//////  }
//Declarations(Class bodys)
//////    // node 13
public class ClassBodyVisitor<R,A> implements ClassBody.Visitor<R,A>
{
@Override
public R visit(ABS.Absyn.FieldClassBody p, A arg)
{
    FieldClassBody fcbo = new FieldClassBody();
        fcbo.equals(p);
        fcbo.hashCode();
        fcbo.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For FieldClassBody Goes Here */
//////	//return value here is type but in the grammar it is typeident_.
//////        //check the grammar with Nikolaus and equivalent specification in ABS with Behrooz
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      
//////      //in progress,current error
//////      return (Java.FieldClassBody (p.typeident_));
//////    }
@Override
public R visit(ABS.Absyn.FieldAssignClassBody p, A arg)
{
    FieldAssignClassBody facb = new FieldAssignClassBody();
        facb.equals(p);
        facb.hashCode();
        facb.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For FieldAssignClassBody Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return (Java.FieldAssignClassBody (p.typeident_(pureexp_)));
//////    }

@Override
public R visit(ABS.Absyn.MethClassBody p, A arg)
{
     MethClassBody mcb = new MethClassBody();
        mcb.equals(p);
        mcb.hashCode();
        mcb.accept(this, arg);
        return this.visit(p, arg);
}

}
                        
//////    {
//////      /* Code For MethClassBody Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (Param x : p.listparam_) {
//////      }
//////      p.block_.accept(new BlockVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
//////
//////  }
//////    // Blocks
//////    //Node 14
public class BlockVisitor<R,A> implements Block.Visitor<R,A>
{
//////  {
@Override
public R  visit(ABS.Absyn.Bloc p, A arg)
{
        Bloc blvc = new Bloc();
        blvc.equals(p);
        blvc.hashCode();
        blvc.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For Bloc Goes Here */
//////	List <JavaStm> ms = empty;
//////      for (Stm x : p.liststm_) {
//////	  Java.Stm i = x.visit();
//////          ms.append(i);
//////      }
//////
//////      return ms;
//////    }
//////
//////  }
//////    // JustBlocks & NoBlocks
//////    //Node 15
public class MaybeBlockVisitor<R,A> implements MaybeBlock.Visitor<R,A>
{
@Override
public R visit(ABS.Absyn.JustBlock p, A arg)
{
     JustBlock jblc = new JustBlock();
        jblc.equals(p);
        jblc.hashCode();
        jblc.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For JustBlock Goes Here */
//////
//////      p.block_.accept(new BlockVisitor<R,A>(), arg);
//////      Java.Block r = p.block_.visit();
//////      return r;
//////    }
@Override
public R visit(ABS.Absyn.NoBlock p, A arg)
{
    NoBlock nblc = new NoBlock();
        nblc.equals(p);
        nblc.hashCode();
        nblc.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For NoBlock Goes Here */
//////
//////        //check with behrooz what is the return value for Noblock
//////        //return (Java.NoBlock (p.));
//////	return null;
//////    }
//////
//////  }
//////    // Formal Paramaters to functions
//////    // Node 16
public class ParamVisitor<R,A> implements Param.Visitor<R,A>
 {
 @Override
 public R visit(ABS.Absyn.Par p, A arg)
 {
        Par lvc = new Par();
        lvc.equals(p);
        lvc.hashCode();
        lvc.accept(this, arg);
        return this.visit(p, arg);
 }
}
//////    {
//////      /* Code For Par Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////
//////      return null;
//////    }
//////
//////  }
//////    //Statements
//////    //Node 17
public class StmVisitor<R,A> implements Stm.Visitor<R,A>
{
@Override
public R visit(ABS.Absyn.SExp p, A arg)
{
      SExp ac = new SExp();
        ac.equals(p);
        ac.hashCode();
        ac.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SExp Goes Here */
//////
//////      p.exp_.accept(new ExpVisitor<R,A>(), arg);
//////
//////      return (Java.SExp (p.exp_));
//////    }
@Override
public R visit(ABS.Absyn.SBlock p, A arg)
{
      SBlock sbvc = new SBlock();
        sbvc.equals(p);
        sbvc.hashCode();
        sbvc.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SBlock Goes Here */
//////
//////      for (Stm x : p.liststm_) {
//////	  Java.Stm i = x.visit();
//////      }
//////
//////      return (Java.SBlock (p.liststm_));
//////    }
@Override
public R visit(ABS.Absyn.SWhile p, A arg)
{
      SWhile wvc = new SWhile();
        wvc.equals(p);
        wvc.hashCode();
        wvc.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SWhile Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      p.stm_.accept(new StmVisitor<R,A>(), arg);
//////
//////      return (Java.SWhile (p.pureexp_(stm_)));
//////    }
@Override
public R visit(ABS.Absyn.SReturn p, A arg)
{  
        SReturn srvc = new SReturn();

        srvc.equals(p);
        srvc.hashCode();
        srvc.accept(this, arg);
        return this.visit(p, arg);
    
}
//////    {
//////      /* Code For SReturn Goes Here */
//////
//////      p.exp_.accept(new ExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SAss p, A arg)
{
      SAss ass = new SAss();
        ass.equals(p);
        ass.hashCode();
        ass.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SAss Goes Here */
//////
//////      //p.ident_;
//////      p.exp_.accept(new ExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SFieldAss p, A arg)
{
      SFieldAss sfvc = new SFieldAss();
        sfvc.equals(p);
        sfvc.hashCode();
        sfvc.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SFieldAss Goes Here */
//////
//////      //p.ident_;
//////      p.exp_.accept(new ExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SDec p, A arg)
{
      SDec dec = new SDec();
        dec.equals(p);
        dec.hashCode();
        dec.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SDec Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SDecAss p, A arg)
{
       SDecAss sda = new SDecAss();
        sda.equals(p);
        sda.hashCode();
        sda.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SDecAss Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      p.exp_.accept(new ExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SIf p, A arg)
{
      SIf staif = new SIf();
        staif.equals(p);
        staif.hashCode();
        staif.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SIf Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      p.stm_.accept(new StmVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
 public R visit(ABS.Absyn.SIfElse p, A arg)
 {
       SIfElse sife = new SIfElse();
        sife.equals(p);
        sife.hashCode();
        sife.accept(this, arg);
        return this.visit(p, arg);
 }
//////    {
//////      /* Code For SIfElse Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      p.stm_1.accept(new StmVisitor<R,A>(), arg);
//////      p.stm_2.accept(new StmVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SSuspend p, A arg)
{
      SSuspend susp = new SSuspend();
        susp.equals(p);
        susp.hashCode();
        susp.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SSuspend Goes Here */
//////
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SSkip p, A arg)
{
      SSkip  ssi = new SSkip ();
        ssi.equals(p);
        ssi.hashCode();
        ssi.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SSkip Goes Here */
//////
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SAssert p, A arg)
{
      SAssert sas = new SAssert();
        sas.equals(p);
        sas.hashCode();
        sas.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For SAssert Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
@Override
public R visit(ABS.Absyn.SAwait p, A arg)
{
      SAwait awa = new SAwait();
        awa.equals(p);
        awa.hashCode();
        awa.accept(this, arg);
        return this.visit(p, arg);
}

        @Override
        public R visit(SThrow p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public R visit(STryCatchFinally p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public R visit(SPrint p, A arg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
//////    {
//////      /* Code For SAwait Goes Here */
//////
//////      p.guard_.accept(new GuardVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
//////
//////  }
//////    //Await guards
//////    // Node 18
public class GuardVisitor<R,A> implements Guard.Visitor<R,A>
 {
@Override
public R visit(ABS.Absyn.VarGuard p, A arg)
{
      VarGuard vrg = new VarGuard();
        vrg.equals(p);
        vrg.hashCode();
        vrg.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For VarGuard Goes Here */
//////
//////      //p.ident_;
//////
//////	return (Java.VarGuard (p.ident_));
//////    }
@Override
public R visit(ABS.Absyn.FieldGuard p, A arg)
{
      FieldGuard fig = new FieldGuard();
        fig.equals(p);
        fig.hashCode();
        fig.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For FieldGuard Goes Here */
//////
//////      //p.ident_;
//////
//////	return (Java.FieldGuard (p.ident_)) ;
//////    }
@Override
public R visit(ABS.Absyn.ExpGuard p, A arg)
{
      ExpGuard exg = new ExpGuard();
        exg.equals(p);
        exg.hashCode();
        exg.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ExpGuard Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return (Java.ExpGuard (p.pureexp_));
//////    }
@Override
public R visit(ABS.Absyn.AndGuard p, A arg)
{
      AndGuard alvc = new AndGuard();
        alvc.equals(p);
        alvc.hashCode();
        alvc.accept(this, arg);
        return this.visit(p, arg);
}

}
//////    {
//////      /* Code For AndGuard Goes Here */
//////
//////      p.guard_1.accept(new GuardVisitor<R,A>(), arg);
//////      p.guard_2.accept(new GuardVisitor<R,A>(), arg);
//////
//////      //return null;
//////    }
//////
//////  }
//Expressions
//////    //Node 19
public class ExpVisitor<R,A> implements Exp.Visitor<R,A>
{
 @Override
 public R visit(ABS.Absyn.ExpP p, A arg)
 {
        ExpP exp = new ExpP();
        exp.equals(p);
        exp.hashCode();
        exp.accept(this, arg); 
        return this.visit(p, arg);
 }
//////    {
//////      /* Code For ExpP Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return (Java.ExpP (p.pureexp_));
//////    }
 @Override
 public R visit(ABS.Absyn.ExpE p, A arg)
{
        ExpE expe = new ExpE();
        expe.equals(p);
        expe.hashCode();
        expe.accept(this, arg);
        return this.visit(p, arg);
}
 }
//////    {
//////      /* Code For ExpE Goes Here */
//////
//////      p.effexp_.accept(new EffExpVisitor<R,A>(), arg);
//////
//////      return (Java.ExpE (p.effexp_));
//////    }
//////
//////  }
//Pure Expressions
//////    // Node 20
public class PureExpVisitor<R,A> implements PureExp.Visitor<R,A>
 {
 @Override
 public R visit(ABS.Absyn.EOr p, A arg)
 {
        EOr eor = new EOr();
        eor.equals(p);
        eor.hashCode();
        eor.accept(this, arg);
        return this.visit(p, arg);
 }
//////    {
//////      /* Code For EOr Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.Let p, A arg)
{
    Let let = new Let();
        let.equals(p);
        let.hashCode();
        let.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For Let Goes Here */
//////
//////      p.param_.accept(new ParamVisitor<R,A>(), arg);
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.If p, A arg)
{
    If synif = new If();
        synif.equals(p);
        synif.hashCode();
        synif.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For If Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_3.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.Case p, A arg)
{
    Case ase = new Case();
        ase.equals(p);
        ase.hashCode();
        ase.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For Case Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      for (CaseBranch x : p.listcasebranch_) {
//////      }
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EAnd p, A arg)
{
    EAnd eand = new EAnd();
        eand.equals(p);
        eand.hashCode();
        eand.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EAnd Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EEq p, A arg)
{
        EEq eeq = new EEq();
        eeq.equals(p);
        eeq.hashCode();
        eeq.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EEq Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ENeq p, A arg)
{
    ENeq eneq = new ENeq();
        eneq.equals(p);
        eneq.hashCode();
        eneq.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ENeq Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ELt p, A arg)
{
        ELt elt = new ELt();
        elt.equals(p);
        elt.hashCode();
        elt.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ELt Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////  
 @Override
 public R visit(ABS.Absyn.ELe p, A arg)
{
    ELe ele = new ELe();
        ele.equals(p);
        ele.hashCode();
        ele.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ELe Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EGt p, A arg)
{
    EGt egt = new EGt();
        egt.equals(p);
        egt.hashCode();
        egt.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EGt Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EGe p, A arg)
{
    EGe ege = new EGe();
        ege.equals(p);
        ege.hashCode();
        ege.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EGe Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EAdd p, A arg)
{
    EAdd eadd = new EAdd();
        eadd.equals(p);
        eadd.hashCode();
        eadd.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EAdd Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ESub p, A arg)
{
    ESub sub = new ESub();
        sub.equals(p);
        sub.hashCode();
        sub.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ESub Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EMul p, A arg)
{
    EMul emul = new EMul();
        emul.equals(p);
        emul.hashCode();
        emul.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EMul Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EDiv p, A arg)
 {
     EDiv ediv = new EDiv();
        ediv.equals(p);
        ediv.hashCode();
        ediv.accept(this, arg);
        return this.visit(p, arg);
 }
//////    {
//////      /* Code For EDiv Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EMod p, A arg)
{
    EMod emod = new EMod();
        emod.equals(p);
        emod.hashCode();
        emod.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EMod Goes Here */
//////
//////      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
//////      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ELogNeg p, A arg)
{
    ELogNeg elog = new ELogNeg();
        elog.equals(p);
        elog.hashCode();
        elog.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ELogNeg Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EIntNeg p, A arg)
{
    EIntNeg eint = new EIntNeg();
        eint.equals(p);
        eint.hashCode();
        eint.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EIntNeg Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EFunCall p, A arg)
{
    EFunCall efun = new EFunCall();
        efun.equals(p);
        efun.hashCode();
        efun.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EFunCall Goes Here */
//////
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EQualFunCall p, A arg)
{
    EQualFunCall equal = new EQualFunCall();
        equal.equals(p);
        equal.hashCode();
        equal.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EQualFunCall Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ENaryFunCall p, A arg)
{
    ENaryFunCall enary = new ENaryFunCall();
        enary.equals(p);
        enary.hashCode();
        enary.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ENaryFunCall Goes Here */
//////
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ENaryQualFunCall p, A arg)
{
    ENaryQualFunCall enqf = new ENaryQualFunCall();
        enqf.equals(p);
        enqf.hashCode();
        enqf.accept(this, arg);
        return this.visit(p, arg);
        
}
//////    {
//////      /* Code For ENaryQualFunCall Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EVar p, A arg)
{
    EVar evar = new EVar();
        evar.equals(p);
        evar.hashCode();
        evar.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EVar Goes Here */
//////
//////      //p.ident_;
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EThis p, A arg)
{
    EThis ethi = new EThis();
        ethi.equals(p);
        ethi.hashCode();
        ethi.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EThis Goes Here */
//////
//////      //p.ident_;
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EQualVar p, A arg)
{
    EQualVar equv = new EQualVar();
        equv.equals(p);
        equv.hashCode();
        equv.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EQualVar Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //p.ident_;
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ESinglConstr p, A arg)
{
    ESinglConstr esing = new ESinglConstr();
        esing.equals(p);
        esing.hashCode();
        esing.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For ESinglConstr Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.EParamConstr p, A arg)
{
    EParamConstr epac = new EParamConstr();
        epac.equals(p);
        epac.hashCode();
        epac.accept(this, arg);
        return this.visit(p, arg);
}
//////    {
//////      /* Code For EParamConstr Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
 @Override
 public R visit(ABS.Absyn.ELit p, A arg)
{
    ELit elit = new ELit();
        elit.equals(p);
        elit.hashCode();
        elit.accept(this, arg);
        return this.visit(p, arg);
}
}
//////    {
//////      /* Code For ELit Goes Here */
//////
//////      p.literal_.accept(new LiteralVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
//////
//////  }
//////    //Cases  
//////  //Node 21
public class CaseBranchVisitor<R,A> implements CaseBranch.Visitor<R,A>
{
 @Override
 public R visit(ABS.Absyn.CaseBranc p, A arg)
 {
     CaseBranc casbr = new CaseBranc();
        casbr.equals(p);
        casbr.hashCode();
        casbr.accept(this, arg);
        return this.visit(p, arg);
 }
}

}


//////    {
//////      /* Code For CaseBranc Goes Here */
//////
//////      p.pattern_.accept(new PatternVisitor<R,A>(), arg);
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
//////
//////  }
//////    // Need to start from this node today
//////  //Pattern matching
//////    //Node 22
/*
public class PatternVisitor<R,A> implements Pattern.Visitor<R,A>
{
public R visit(ABS.Absyn.IdentPat p, A arg)
{
    ExpE expe = new ExpE();
        expe.equals(p);
        expe.hashCode();
        expe.accept(this, arg);
}
//////    {
//////      /* Code For IdentPat Goes Here */
//////        Java.Ident r = p.ident_.visit();
//////       
//////      //p.ident_;
//////
//////	return r;
//////    }
/*public Java.Literal visit(ABS.Absyn.LitPat p, A arg)
{
    ExpE expe = new ExpE();
        expe.equals(p);
        expe.hashCode();
        expe.accept(this, arg);
}
//////    {
//////      /* Code For LitPat Goes Here */
//////
//////      p.literal_.accept(new LiteralVisitor<R,A>(), arg);
//////      Java.Literal r = p.literal_.visit();
//////      return r;
//////    }
/*public Java.TypeIdent visit(ABS.Absyn.SinglConstrPat p, A arg)
{
    ExpE expe = new ExpE();
        expe.equals(p);
        expe.hashCode();
        expe.accept(this, arg);
}
//////    {
//////      /* Code For SinglConstrPat Goes Here */
//////
//////      //p.typeident_;
//////        Java.TypeIdent r = p.typeident_.visit();
//////	return r;
//////    }
/*public List<JavaPattern> visit(ABS.Absyn.ParamConstrPat p, A arg)
{
    ExpE expe = new ExpE();
        expe.equals(p);
        expe.hashCode();
        expe.accept(this, arg);
}
//////    {
//////      /* Code For ParamConstrPat Goes Here */
//////
//////      //p.typeident_;
//////	List<JavaPattern> pr = empty;
//////      for (Pattern x : p.listpattern_) {
//////	  Java.Pattern i = x.visit();  
//////	  pr.append(i);
//////    }
//////
//////      return (pr);
//////    }
/**public R visit(ABS.Absyn.UnderscorePat p, A arg)
{
    ExpE expe = new ExpE();
        expe.equals(p);
        expe.hashCode();
        expe.accept(this, arg);
}
//////    {
//////      /* Code For UnderscorePat Goes Here */
//////
//////
//////	return (Java.UnderscorePat (p.under));
//////    }
//////
//////  }
//////    //Literals   
////// //Node 23
//////  public class LiteralVisitor<R,A> implements Literal.Visitor<R,A>
//////  {
//////    public Java.LNull visit(ABS.Absyn.LNull p, A arg)
//////    {
//////      /* Code For LNull Goes Here */
//////
//////      	return null;
//////    }
//////    public Java.LThis visit(ABS.Absyn.LThis p, A arg)
//////    {
//////      /* Code For LThis Goes Here */
//////
//////
//////	return null;
//////    }
//////    public LThisDC visit(ABS.Absyn.LThisDC p, A arg)
//////    {
//////      /* Code For LThisDC Goes Here */
//////
//////// no options provided for this node, check with behrooz equivalent in ABS 
//////	//return (Java.LThisDC (p.thisDC));
//////	return null;
//////    }
//////    public Java.String visit(ABS.Absyn.LStr p, A arg)
//////    {
//////      /* Code For LStr Goes Here */
//////        Java.String r = p.string_.visit();
//////
//////      //p.string_;
//////
//////	return r;
//////    }
//////    public Java.Integer visit(ABS.Absyn.LInt p, A arg)
//////    {
//////      /* Code For LInt Goes Here */
//////
//////      //p.integer_;
//////        Java.Integer r =p.integer_.visit();
//////	return r;
//////    }
//////
//////  }
//////    //effectful expressions    
//////    // Node 24
//////  public class EffExpVisitor<R,A> implements EffExp.Visitor<R,A>
//////  {
//////    public  R visit(ABS.Absyn.New p, A arg)
//////    {
//////      /* Code For New Goes Here */
//////	
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      //List<JavaPureExp>
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.NewLocal p, A arg)
//////    {
//////      /* Code For NewLocal Goes Here */
//////
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.SyncMethCall p, A arg)
//////    {
//////      /* Code For SyncMethCall Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.ThisSyncMethCall p, A arg)
//////    {
//////      /* Code For ThisSyncMethCall Goes Here */
//////
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.AsyncMethCall p, A arg)
//////    {
//////      /* Code For AsyncMethCall Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.ThisAsyncMethCall p, A arg)
//////    {
//////      /* Code For ThisAsyncMethCall Goes Here */
//////
//////      //p.ident_;
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.Get p, A arg)
//////    {
//////      /* Code For Get Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////
//////      return null;
//////    }
//////    public R visit(ABS.Absyn.Spawns p, A arg)
//////    {
//////      /* Code For Spawns Goes Here */
//////
//////      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
//////      p.type_.accept(new TypeVisitor<R,A>(), arg);
//////      for (PureExp x : p.listpureexp_) {
//////      }
//////
//////      return null;
//////    }
//////
//////  }
////       
////

        
  