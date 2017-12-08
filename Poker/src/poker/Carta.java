

package poker;

public class Carta {
    
    private int seme;
    private int valore;
    private String[] immagine={"♥","♦","♣","♠"};

    public int getSeme() {
        return seme;
    }

    public void setSeme(int seme) {
        if(seme >= 0 && seme < 4){
            this.seme = seme;
        }else this.seme=0;
        
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        if(valore > 0 && valore < 14){
            this.valore = valore;
        }else this.valore = 13;
        
    }

    public Carta(int valore, int seme) {
        if(seme >= 0 && seme < 4){this.seme = seme;}
        else this.seme=0;
        if(valore > 0 && valore < 14) {this.valore = valore;}
        else this.valore = 1;
    }
    
    public int compareTo(Carta c){
        if(this.valore > c.valore) return 1;
        if(this.valore == c.valore) return 0;
        return -1;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.seme != other.seme) {
            return false;
        }
        if (this.valore != other.valore) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if(valore == 1) return "Carta: A "+immagine[seme];
        if(valore == 11) return "Carta: J "+immagine[seme];
        if(valore == 12) return "Carta: Q "+immagine[seme];
        if(valore == 13) return "Carta: K "+immagine[seme];
        return "Carta: " + valore + " " + immagine[seme];
    }
    
}
