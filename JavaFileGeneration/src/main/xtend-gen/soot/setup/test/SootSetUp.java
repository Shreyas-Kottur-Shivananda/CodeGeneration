package soot.setup.test;

import java.io.File;

import com.google.common.collect.Lists;

import soot.G;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.Transformer;
import soot.options.Options;

public abstract class SootSetUp {

	protected void executeStaticAnalysis() {
		setupSoot();
		registerSootTransformers();
		executeSootTransformers();
	}
	
	private void executeSootTransformers() {
		// This will run the intra-procedural analysis
		PackManager.v().runPacks();
	}
	
	private void registerSootTransformers() {
		// add the analysis to jimple transform pack (jtp)
		Transform transform = new Transform("jtp.analysis", createAnalysisTransformer());
		PackManager.v().getPack("jtp").add(transform);
	}
	
	protected abstract Transformer createAnalysisTransformer();
	
	protected static void setupSoot() {
		G.reset();
		String userdir = System.getProperty("user.dir");
		String sootCp = "C:\\Program Files\\Java\\jre1.8.0_181\\lib\\rt.jar";
		
		Options.v().set_interactive_mode(true);
		//Options.v().set_whole_program(true);
		Options.v().set_soot_classpath(sootCp);
		Options.v().set_no_bodies_for_excluded(true);
		Options.v().set_full_resolver(true);
		Options.v().set_process_dir(Lists.newArrayList(userdir + File.separator + "target" + File.separator + "classes"));
		Options.v().set_allow_phantom_refs(true);
		Options.v().setPhaseOption("jb", "use-original-names:true");
		Options.v().setPhaseOption("jb.uce", "enabled:false");
	//	Options.v().setPhaseOption("jb","enabled:false");
	//	Options.v().setPhaseOption("jj", "enabled:false");
	//	Options.v().setPhaseOption("jb.lns","enabled:false");
	//	Options.v().setPhaseOption("jb.lns", "sort-locals:true");
	//	Options.v().setPhaseOption("jb.a","enabled:false");
//		Options.v().setPhaseOption("jb.a", "only-stack-locals:false");
//		Options.v().setPhaseOption("jb.ule", "enabled:false");
//		Options.v().setPhaseOption("jb.cp", "enabled:false");
//		Options.v().setPhaseOption("jb.cp", "only-stack-locals:false");
//		Options.v().setPhaseOption("jb.dae", "enabled:false");
//		Options.v().setPhaseOption("jb.dae", "only-stack-locals:false");
//		Options.v().setPhaseOption("(jb.cp-ule", "enabled:false");
		
		//Call Graph Options
		Options.v().setPhaseOption("cg.spark", "enabled:true");
//		Options.v().setPhaseOption("cg.cha", "enabled:true");
//		Options.v().setPhaseOption("cg.cha", "apponly:true");
	//	Options.v().setPhaseOption("wjop", "enabled:true");
//		Options.v().setPhaseOption("wjap.purity", "enabled:true");
		Options.v().setPhaseOption("cg.spark", "set-mass:true");
	//	Options.v().setPhaseOption("cg", "safe-newinstance:true");
	//	Options.v().setPhaseOption("cg", "library:signature-resolution");
		Options.v().setPhaseOption("wjap", "wjap.cgg:true");
		
		
		
		
//		Options.v().setPhaseOption("wsop", "enabled:true");
		
		Options.v().set_prepend_classpath(false);
		Options.v().set_output_format(Options.output_format_none);
		
		Scene.v().loadNecessaryClasses();
		
	}
	
	
}
