package service;

import modelo.Operador;

@Service
public class ProblematecnicoService {
    @Autowired
    private Operador operadorRepository;

    public void salvarOperador(Operador operador) {
        operadorRepository.save(operador);
    }

    public List<Operador> buscarOperador(String funcional) {
        if (funcional != null) {
            // select * from operador where funcional = '123456'
            return operadorRepository.findByFuncional(funcional);
        } else {
            //select * from operador
            return operadorRepository.findAll();
        }
    }

    public Operador buscaOperadorFuncional(String funcional) {
        return operadorRepository.findByFuncional(funcional);
    }

    public boolean excluirOperador(String funcional) {
        Operador operador = operadorRepository.findByFuncional(funcional);
        if (operador != null) {
            operadorRepository.delete(operador);
            return true;
        }
        return false;
    }

    public boolean atualizarOperador(String Funcional, Operador operador) {
        Operador operador1DB = operadorRepository.findByFuncional(buscaOperadorFuncional());
        if (operador != null) {
            operador1DB.setNome(operador.getNome());
            operador1DB.setFuncional(operador.getEndereco());
            operadorRepository.save(operador1DB);
            return true;
        }
        return false;
    }

}
