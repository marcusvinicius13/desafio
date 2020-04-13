import React from  'react';

import { FiLogIn } from 'react-icons/fi'

import './styles.css';

import logon from '../../assets/logon.png';

export default function Logon() {
  return (
    <div className="logon-container">
      <section className="form">
        <form>
          <h1>Mirante Tecnologia</h1>
          <input placeholder="Login"/>
          <input placeholder="Senha"/>

          <button className="button" type="submit">Entrar</button>

        </form>
      </section>

      <img  className="imagem-login" src={logon} alt="Logon"/>
    </div>
  );
}