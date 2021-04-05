package FileGenerator

import java.io.File
import java.io.PrintWriter
import java.lang.reflect.Array

class JavaFileGenerator {
	
	var static File[] files = newArrayOfSize(3)
	var static count = 0
	def static void main(String[] args) {
		Generate("C:\\Users\\LENOVO\\Desktop\\MyGeneration\\src\\test\\java\\soot\\setup\\test\\JimpleObtainer",''' 
		import java.util.Map;
		
		import soot.Body;
		import soot.BodyTransformer;
		import soot.Scene;
		import soot.SceneTransformer;
		import soot.Transformer;
		
		public class JimpleObtainer extends SootSetUp {
			
			private Scene scene;
		
		//	@Override
		//	protected Transformer createAnalysisTransformer() {
		//		// TODO Auto-generated method stub
		//		return new SceneTransformer() {
		//
		//			@Override
		//			protected void internalTransform(String phaseName, Map<String, String> options) {
		//				// TODO Auto-generated method stub
		//				scene = Scene.v();
		//			}
		//		};
		//	}
			
			public void setup() throws Exception {
				executeStaticAnalysis();
			}
		
		 @Override
		 protected Transformer createAnalysisTransformer() {
		 	// TODO Auto-generated method stub
		 	return new BodyTransformer() {
		
		 		@Override
		 		protected void internalTransform(Body b, String phaseName, Map<String, String> options) {
		 			// TODO Auto-generated method stub
		
		 		}
		 	};
		 }
		
		}
		''')
		
		Generate("C:\\Users\\LENOVO\\Desktop\\MyGeneration\\src\\test\\java\\soot\\setup\\test\\SootSetUp",'''
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
		''')
		GeneratePOM("C:\\Users\\LENOVO\\Desktop\\MyGeneration\\pom")
		
		var file = new File("Demo.zip")
		var cj = new CreateJar()
		cj.createJar(file, files)
		
		
	}
	
	def static void Generate(String Path, String Contents){
		
		WriteFile(Path,Contents)
	}
	
	def static void GeneratePOM(String Path){
		WriteFilePOM(Path,'''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
		  <modelVersion>4.0.0</modelVersion>
		  <groupId>shreyas</groupId>
		  <artifactId>SootFamiliarization</artifactId>
		  <version>0.0.1-SNAPSHOT</version>
		  
		  
		  <properties>
		    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		    <maven.compiler.target>1.8</maven.compiler.target>
		    <maven.compiler.source>1.8</maven.compiler.source>
		    <maven.compiler.testSource>1.8</maven.compiler.testSource>
		    <maven.compiler.testTarget>1.8</maven.compiler.testTarget>
		  </properties>
		  
			<build>
				<plugins>
					<plugin>
						<artifactId>maven-compiler-plugin</artifactId>
						<version>3.6.1</version>
						<configuration>
							<source>1.8</source>
							<target>1.8</target>
					        <testSource>1.8</testSource>
					        <testTarget>1.8</testTarget>
						</configuration>
					</plugin>
				</plugins>
			</build>
		  
		  
		  <dependencies>
				<dependency>
					<groupId>ca.mcgill.sable</groupId>
					<artifactId>soot</artifactId>
					<version>3.0.0-SNAPSHOT</version>
				</dependency>
				<dependency>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
					<version>4.12</version>
					<scope>test</scope>
				</dependency>
			</dependencies>
		  
		  
		</project>
		''')
		
	}
	
	def static WriteFilePOM(String Path, String contents){
		var file = new File(Path + ".xml")
		if(!file.exists()){
			file.createNewFile()
		}
		val pr = new PrintWriter(file);
		try {
			pr.print(contents.toString);
		} finally {
			pr.close();
		}
		
		files.set(count,file)
		count = count + 1
	}
	
	def static WriteFile(String Path, String Contents){
		var file = new File(Path + ".java")
		if(!file.exists()){
			val directory = file.getParentFile();
			if (!directory.exists()) {
				directory.mkdirs();
			}
			file.createNewFile()
		}
		val pr = new PrintWriter(file);
		try {
			pr.print(Contents.toString);
		} finally {
			pr.close();
		}	
		
		files.set(count,file)
		count = count + 1
		
	}
}