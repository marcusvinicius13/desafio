import React from 'react';
import { Link } from 'react-router-dom';
import { FiPower} from 'react-icons/fi';

import './styles.css';

export default function People() {
  return (
    <div className="people-container">
      
      
      <div className="content">  
      
        <section>
          <header>
            <span>Bem vido, Marcus</span>
            <div className="menu">
              <Link className="back-link" to="/people">Cadastrar Pessoa | </Link>
              <Link className="back-link" to="/operators">Cadastrar Operador | </Link>
              <Link className="back-link" to="/operators">Listar</Link>
            </div>
          
            <button type="button">
              <FiPower size={18} color="#ff6584" />
            </button>
          </header>

          <h1>Nova Pessoa</h1>

          
          <form>
            <input placeholder="Informe o nome"/>
            <input placeholder="Informe o documento"/>
            <input placeholder="Informe a data de nascimento"/>
            <input placeholder="Informe o nome da mãe"/>
            <input placeholder="Informe o nome do pai"/>
            <input placeholder="Informe o tipo de pessoa (Física ou Jurídica)"/>

            <button className="button" type="submit" >Cadastrar</button>
          </form>

        </section>
      </div>
    </div>
  );
}