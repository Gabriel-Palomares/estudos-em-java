public class TelaInicial {
    public static void main(String[] args) {


    }

    public static void exibirMenuInicial() {
        System.out.print("""
                ***************************************************************
                *                  Bem Vindo a LocadoraBrasil                 *
                *                                                             *
                *                 Para continuar faça o login                 *
                *                                                             *
                *          1 - Login                                          *
                *          2 - Cadastro                                       *
                *          3 - Recuperar senha                                *
                *                                                             *
                ***************************************************************
                """);
    }

    public static void exibirMenuLogin() {
        System.out.print("""
                ***************************************************************
                *                  Bem Vindo a LocadoraBrasil                 *
                *                                                             *
                *                   Insira seu login abaixo                   *
                *                                                             *
                *          nome:                                              *
                *          senha:                                             *
                *                                                             *
                *                          |Entrar|                           *
                *                                                             *
                *                        |Funcionario|                        *
                *                                                             *
                ***************************************************************
                """);
    }

    public static void exibirMenuCadastro() {
        System.out.print("""
                ***************************************************************
                *                  Bem Vindo a LocadoraBrasil                 *
                *                                                             *
                *                  Insira seu Cadastro abaixo                 *
                *                                                             *
                *          nome:                                              *
                *          senha:                                             *
                *          numero de recuperação:                             *
                *                                                             *
                *                          |Entrar|                           *
                *                                                             *
                ***************************************************************
                """);
    }

    public static void exibirMenuRecuperacao() {
        System.out.print("""
                ***************************************************************
                *                  Bem Vindo a LocadoraBrasil                 *
                *                                                             *
                *                  Insira seu Cadastro abaixo                 *
                *                                                             *
                *          nome:                                              *
                *          numero de recuperação:                             *
                *                                                             *
                *                          |Entrar|                           *
                *                                                             *
                ***************************************************************
                """);
    }
}
