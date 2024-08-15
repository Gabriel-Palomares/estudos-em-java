package POO;

public class Carro {
        String modelo;
        int ano;
        String cor;

        void exibirInfo(){
            System.out.printf("""
        este carro é do modelo %s da cor %s e do ano %d
        """, modelo, cor, ano);
        }
        public void idade(){
            int idade = 2024 - ano;
            System.out.printf("""
                    o carro tem %d anos
                    """, idade);

        }
}

