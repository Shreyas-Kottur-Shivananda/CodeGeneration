package soot.setup.test;

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
