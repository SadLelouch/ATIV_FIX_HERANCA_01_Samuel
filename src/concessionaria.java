public class concessionaria {
    public static void main (String [] args){
        Carro carro;
        carro = new Carro();

        carro.setNome("Camaro");
        carro.setTipo("Carro");
        carro.setAno("2011");
        carro.setCor("Azul");

        Moto moto;
        moto = new Moto();

        moto.setNome("Kawasaki");
        moto.setTipo("Moto");
        moto.setAno("2016");
        moto.setCor("Verde");

        System.out.println("Dados do carro");
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());

        System.out.println("Dados da moto");
        System.out.println("Nome: " + moto.getNome());
        System.out.println("Tipo: " + moto.getTipo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
    }
}
