public class ConverteRomano {
    public int romanoEmInteiro(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Numero invalido");
        }
        
        int[] values = new int[256];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int resultado = 0;
        int aux = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int valorAtual = values[s.charAt(i)];
            if (valorAtual < aux) {
                resultado -= valorAtual;
            } else {
                resultado += valorAtual;
            }
            aux = valorAtual;
        }
        
        return resultado;
    }
}

