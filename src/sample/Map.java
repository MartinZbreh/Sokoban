package sample;

import java.util.ArrayList;

public class Map {

    ArrayList<ArrayList<GameObject>> map;

    Map(){
        this.map = null;
    }

    Map(ArrayList<ArrayList<GameObject>> map){
        this.map = map;
    }

    void ActualiserGameObject(GameObject go){
        map.get(go.getPosX()).set(go.getPosY(), go);
    }

    void ActualiserJoueur(Joueur j){
        map.get(j.getPosX()).set(j.getPosY(), j);
    }

    void MovePlayer(Joueur j, int x, int y){
        GameObject caseCible = map.get(j.getPosX() + x).get(j.getPosY() + y);
        if (caseCible == null){
          //  j.ActualiserCoordonnees(x,y);
            ActualiserJoueur(j);
        }
    }
}