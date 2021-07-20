import React from "react"
import { Switch, Route } from "react-router-dom";
import Game from "./Game/Game";

const NavBar = props => {
  return (
    <Switch>
      <Route exact path="/game/:id" component={Game} />
    </Switch>
  )
};

export default NavBar;