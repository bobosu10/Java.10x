package LP2.Lista4_ex002;

public class EquipamentosSonoros extends Equipamento {

    private short volume;//0 a 10
    private boolean stereo;

    public EquipamentosSonoros(boolean ligado, String nome, boolean stereo, short volume) {
        super(ligado, nome);
        this.stereo = stereo;
        this.volume = volume;
    }

    public boolean isStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public String ativarMono(){
        stereo = false;
        System.out.println("VOLUME EM "+volume);
        return "Audio mono ativado";
    }

    public String ativarStereo(){
        stereo = true;
        System.out.println("VOLUME EM "+volume);
        return "Audio stereo ativado";
    }

    @Override
    public String ligar() {
        volume = 5;
        System.out.println("VOLUME EM "+volume);
        return super.ligar();
    }
}
