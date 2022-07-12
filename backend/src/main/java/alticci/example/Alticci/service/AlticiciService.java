package alticci.example.Alticci.service;

import alticci.example.Alticci.models.SequenciaModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlticiciService {

    public List<Integer> calculoService(Integer n){

        List<Integer> aList = new ArrayList<Integer>();

        for (int i = 0; i < n ; i++) {
            //System.out.print("(" + i + "):" + alti(i) + "\t");
            aList.add(alti(i));
        }
        return  aList;
    };

    public static Integer alti(int n) {
        if (n == 0) {
            return 0;
        } else if(n == 1 || n == 2){
            return 1;
        }else{
            return alti(n - 3) + alti(n - 2);
        }
    }
}
