import java.util.ArrayList;
import java.util.List;

public class korttiPakka implements korttipino {

    private List<pelikortti> kortit = new ArrayList<pelikortti>();

    public korttiPakka (){
        kortit = new ArrayList<pelikortti>();
    }

    @Override
    public void lisää(pelikortti kortti) {
        kortit.add(0,kortti);


    }

    public pelikortti poista() {
        kortit.remove(kortit);

        return null;
    }

    @Override
    public int annaKoko() {


        return kortit.size();
    }

    @Override

    public pelikortti anna(int index) {

        if (index >= 0 && index < kortit.size()) {
            return kortit.get(index);


        }
        return null;
    }
}








