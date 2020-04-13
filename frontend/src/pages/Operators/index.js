import React from 'react';
import { Link } from 'react-router-dom';
import { FiPower} from 'react-icons/fi';

import './styles.css';

export default function Operators() {
  return (
    <div className="operator-container">
      <div className="content">
        <section>

          <header>
            <span>Bem vido, Marcus</span>
            <div className="menu">
              <Link className="back-link" to="/people"> Cadastrar Pessoa | </Link>
              <Link className="back-link" to="/operators"> Cadastrar Operador | </Link>
              <Link className="back-link" to="/list-operators"> Listar</Link>
            </div>
          
            <button type="button">
              <FiPower size={18} color="#ff6584" />
            </button>
          </header>

          <h1>Operadores</h1>
        
          <form>
            <input placeholder="Informe o nome do Operador"/>
            <input placeholder="Informe o login do Operador"/>
            <input placeholder="Informe a senha do Operador"/>
            <input placeholder="Informe o perfil do Operador (Gerente ou Analista)"/>

            <button className="button" type="submit" >Cadastrar</button>
          </form>

        </section>

        

      </div>
    </div>
  );
}