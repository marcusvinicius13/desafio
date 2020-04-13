import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Logon from './pages/Logon';

import Operators from './pages/Operators';
import ProfileOperator from './pages/ProfileOperator';
import People from './pages/People';

export default function Routes() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Logon} />
        <Route path="/operators" component={Operators} />
        <Route path="/list-operators" component={ProfileOperator} />
        <Route path="/people" component={People} />
      </Switch>
    </BrowserRouter>
  );
}