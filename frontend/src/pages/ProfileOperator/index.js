import React from 'react';
import { Link } from  'react-router-dom';
import { FiPower, FiTrash2 } from 'react-icons/fi';

import './styles.css';

export default function ProfileOperator () {
  return (
    <div className="profile-operator-container">
      
      <header>
        <h1>Mirante Tecnologia</h1>
        <span>Bem vido, Marcus</span>
        <div className="menu">
          <Link className="back-link" to="/people"> Cadastrar Pessoa</Link>
          <Link className="back-link" to="/operators"> Cadastrar Operador</Link>
        </div>
        <button type="button">
          <FiPower size={18} color="#ff6584" />
        </button>
      </header>

      <h1 className="titulo" >Lista de Operadores</h1>
      <ul>
        <li>
          <strong>Nome</strong>
          <p>Marcus Vinícius</p>

          <strong>Login</strong>
          <p>Kakoloku</p>

          <strong>Perfil</strong>
          <p>Gerente</p>

          <button type="button">
            <FiTrash2 size={20} color="#a8a8b3"/>
          </button>
        </li>

        <li>
          <strong>Nome</strong>
          <p>Marcus Vinícius</p>

          <strong>Login</strong>
          <p>Kakoloku</p>

          <strong>Perfil</strong>
          <p>Gerente</p>

          <button type="button">
            <FiTrash2 size={20} color="#a8a8b3"/>
          </button>
        </li>


        <li>
          <strong>Nome</strong>
          <p>Marcus Vinícius</p>

          <strong>Login</strong>
          <p>Kakoloku</p>

          <strong>Perfil</strong>
          <p>Gerente</p>

          <button type="button">
            <FiTrash2 size={20} color="#a8a8b3"/>
          </button>
        </li>


        <li>
          <strong>Nome</strong>
          <p>Marcus Vinícius</p>

          <strong>Login</strong>
          <p>Kakoloku</p>

          <strong>Perfil</strong>
          <p>Gerente</p>

          <button type="button">
            <FiTrash2 size={20} color="#a8a8b3"/>
          </button>
        </li>
      </ul>
    </div>
  );
}