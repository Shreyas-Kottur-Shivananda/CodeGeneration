package FileGenerator;

import FileGenerator.CreateJar;
import java.io.File;
import java.io.PrintWriter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class JavaFileGenerator {
  private static File[] files = new File[3];
  
  private static int count = 0;
  
  public static void main(final String[] args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import soot.Body;");
    _builder.newLine();
    _builder.append("import soot.BodyTransformer;");
    _builder.newLine();
    _builder.append("import soot.Scene;");
    _builder.newLine();
    _builder.append("import soot.SceneTransformer;");
    _builder.newLine();
    _builder.append("import soot.Transformer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class JimpleObtainer extends SootSetUp {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Scene scene;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//\t@Override");
    _builder.newLine();
    _builder.append("//\tprotected Transformer createAnalysisTransformer() {");
    _builder.newLine();
    _builder.append("//\t\t// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("//\t\treturn new SceneTransformer() {");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("//\t\t\t@Override");
    _builder.newLine();
    _builder.append("//\t\t\tprotected void internalTransform(String phaseName, Map<String, String> options) {");
    _builder.newLine();
    _builder.append("//\t\t\t\t// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("//\t\t\t\tscene = Scene.v();");
    _builder.newLine();
    _builder.append("//\t\t\t}");
    _builder.newLine();
    _builder.append("//\t\t};");
    _builder.newLine();
    _builder.append("//\t}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setup() throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("executeStaticAnalysis();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("protected Transformer createAnalysisTransformer() {");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("return new BodyTransformer() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("protected void internalTransform(Body b, String phaseName, Map<String, String> options) {");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("};");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    JavaFileGenerator.Generate("C:\\Users\\LENOVO\\Desktop\\MyGeneration\\src\\test\\java\\soot\\setup\\test\\JimpleObtainer", _builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package soot.setup.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import java.io.File;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import com.google.common.collect.Lists;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import soot.G;");
    _builder_1.newLine();
    _builder_1.append("import soot.PackManager;");
    _builder_1.newLine();
    _builder_1.append("import soot.Scene;");
    _builder_1.newLine();
    _builder_1.append("import soot.Transform;");
    _builder_1.newLine();
    _builder_1.append("import soot.Transformer;");
    _builder_1.newLine();
    _builder_1.append("import soot.options.Options;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public abstract class SootSetUp {");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("protected void executeStaticAnalysis() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("setupSoot();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("registerSootTransformers();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("executeSootTransformers();");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private void executeSootTransformers() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("// This will run the intra-procedural analysis");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("PackManager.v().runPacks();");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("private void registerSootTransformers() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("// add the analysis to jimple transform pack (jtp)");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Transform transform = new Transform(\"jtp.analysis\", createAnalysisTransformer());");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("PackManager.v().getPack(\"jtp\").add(transform);");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("protected abstract Transformer createAnalysisTransformer();");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("protected static void setupSoot() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("G.reset();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("String userdir = System.getProperty(\"user.dir\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("String sootCp = \"C:\\\\Program Files\\\\Java\\\\jre1.8.0_181\\\\lib\\\\rt.jar\";");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_interactive_mode(true);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("//Options.v().set_whole_program(true);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_soot_classpath(sootCp);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_no_bodies_for_excluded(true);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_full_resolver(true);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_process_dir(Lists.newArrayList(userdir + File.separator + \"target\" + File.separator + \"classes\"));");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_allow_phantom_refs(true);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().setPhaseOption(\"jb\", \"use-original-names:true\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().setPhaseOption(\"jb.uce\", \"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"jb\",\"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"jj\", \"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"jb.lns\",\"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"jb.lns\", \"sort-locals:true\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"jb.a\",\"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"jb.a\", \"only-stack-locals:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"jb.ule\", \"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"jb.cp\", \"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"jb.cp\", \"only-stack-locals:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"jb.dae\", \"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"jb.dae\", \"only-stack-locals:false\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"(jb.cp-ule\", \"enabled:false\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("//Call Graph Options");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().setPhaseOption(\"cg.spark\", \"enabled:true\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"cg.cha\", \"enabled:true\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"cg.cha\", \"apponly:true\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"wjop\", \"enabled:true\");");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"wjap.purity\", \"enabled:true\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().setPhaseOption(\"cg.spark\", \"set-mass:true\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"cg\", \"safe-newinstance:true\");");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("//\tOptions.v().setPhaseOption(\"cg\", \"library:signature-resolution\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().setPhaseOption(\"wjap\", \"wjap.cgg:true\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("//\t\tOptions.v().setPhaseOption(\"wsop\", \"enabled:true\");");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_prepend_classpath(false);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Options.v().set_output_format(Options.output_format_none);");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Scene.v().loadNecessaryClasses();");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    JavaFileGenerator.Generate("C:\\Users\\LENOVO\\Desktop\\MyGeneration\\src\\test\\java\\soot\\setup\\test\\SootSetUp", _builder_1.toString());
    JavaFileGenerator.GeneratePOM("C:\\Users\\LENOVO\\Desktop\\MyGeneration\\pom");
    File file = new File("Demo.zip");
    CreateJar cj = new CreateJar();
    cj.createJar(file, JavaFileGenerator.files);
  }
  
  public static void Generate(final String Path, final String Contents) {
    JavaFileGenerator.WriteFile(Path, Contents);
  }
  
  public static void GeneratePOM(final String Path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<modelVersion>4.0.0</modelVersion>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<groupId>shreyas</groupId>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<artifactId>SootFamiliarization</artifactId>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<version>0.0.1-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<properties>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<maven.compiler.target>1.8</maven.compiler.target>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<maven.compiler.source>1.8</maven.compiler.source>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<maven.compiler.testSource>1.8</maven.compiler.testSource>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<maven.compiler.testTarget>1.8</maven.compiler.testTarget>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<artifactId>maven-compiler-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<version>3.6.1</version>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<source>1.8</source>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<target>1.8</target>");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("<testSource>1.8</testSource>");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("<testTarget>1.8</testTarget>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</build>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>ca.mcgill.sable</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>soot</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>3.0.0-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>junit</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>junit</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>4.12</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    JavaFileGenerator.WriteFilePOM(Path, _builder.toString());
  }
  
  public static int WriteFilePOM(final String Path, final String contents) {
    try {
      int _xblockexpression = (int) 0;
      {
        File file = new File((Path + ".xml"));
        boolean _exists = file.exists();
        boolean _not = (!_exists);
        if (_not) {
          file.createNewFile();
        }
        final PrintWriter pr = new PrintWriter(file);
        try {
          pr.print(contents.toString());
        } finally {
          pr.close();
        }
        JavaFileGenerator.files[JavaFileGenerator.count] = file;
        _xblockexpression = JavaFileGenerator.count = (JavaFileGenerator.count + 1);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static int WriteFile(final String Path, final String Contents) {
    try {
      int _xblockexpression = (int) 0;
      {
        File file = new File((Path + ".java"));
        boolean _exists = file.exists();
        boolean _not = (!_exists);
        if (_not) {
          final File directory = file.getParentFile();
          boolean _exists_1 = directory.exists();
          boolean _not_1 = (!_exists_1);
          if (_not_1) {
            directory.mkdirs();
          }
          file.createNewFile();
        }
        final PrintWriter pr = new PrintWriter(file);
        try {
          pr.print(Contents.toString());
        } finally {
          pr.close();
        }
        JavaFileGenerator.files[JavaFileGenerator.count] = file;
        _xblockexpression = JavaFileGenerator.count = (JavaFileGenerator.count + 1);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
