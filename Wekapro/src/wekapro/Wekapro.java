/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import weka.classifiers.trees.J48;

/**
 *
 * @author Administrator
 */
public class Wekapro {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        // TODO code application logic here
//        myknowledgemodel model = new myknowledgemodel(
//                 "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
//        System.out.println(model);
//        model.savedata("D:\\data\\iris.arff");
//        model.saveData2CSV("D:\\data\\iris_CSV.csv");

     MyAprioriModel model = new MyAprioriModel("C:\\Program Files\\Weka-3-8-5\\data\\weather.numeric.arff",
             "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
             "-R 2-3");
     model.mineAssociationaRules();
//    MyFPGrowtModel model = new MyFPGrowtModel("C:\\Program Files\\Weka-3-8-5\\data\\weather.nominal.arff",
//            "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
//            "-N -R first-last");
//    model.mineAssociationRules();
     System.out.println(model);
//    }

//        myknowledgemodel model = new myknowledgemodel( "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff", null, null);
//        model.trainset = model.divideTrainTestR(model.dataset, 70, false);
//        model.testset = model.divideTrainTestR(model.dataset, 70, true);
//        System.out.println(model);
//        System.out.println(model.trainset.toSummaryString());
//        System.out.println(model.testset.toSummaryString());

//        MyDecisionTreeModel model = new MyDecisionTreeModel("C:\\Program Files\\Weka-3-8-5\\data\\iris.arff",
//                "-C 0.25 -M 2", null);
//        model.buildDecisionTree();
//        model.evaluateDicisionTree();
//        System.out.println(model);
//       // model.saveModel("D:\\data\\model\\decitiontree.model", model.tree);
//       model.tree = (J48)model.loadModel("D:\\data\\model\\decitiontree.model");
//       model.predictClassLabel(model.testset);
        
    }
}
