package br.fiap.filaMensagens;

import br.fiap.mensagem.Mensagem;

public class FilaMensagens {

	private class NO {
		Mensagem msg;
		NO prox;
	}
	
	NO ini, fim;
	
	public void init() {
		ini = fim = null;
	}
	
	public boolean isEmpty() {
		if (ini == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enqueue(Mensagem msg) {
        NO novo = new NO();
        novo.msg = msg;
        if (!isEmpty()) {
            fim.prox = novo;
        } else {
            ini = novo;
        }
        fim = novo;
    }
    public Mensagem dequeue() {
    	Mensagem  retorno = ini.msg;
        ini = ini.prox;
        if (ini == null) {
            fim = null;
        }
        return retorno;
    }
    public Mensagem first() {
        return ini.msg;
    }
	
}
