#!/usr/bin/env python3
# Copyright © 2012-13 Qtrac Ltd. All rights reserved.
# This program or module is free software: you can redistribute it
# and/or modify it under the terms of the GNU General Public License as
# published by the Free Software Foundation, either version 3 of the
# License, or (at your option) any later version. It is provided for
# educational purposes and is distributed in the hope that it will be
# useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
# General Public License for more details.

from command.commandForGrid.undoableGrid import UndoableGrid


def main():
    html = []
    grid = UndoableGrid(8, 3)   # (1) Empty
    html.append(grid.as_html("(1) Empty"))
    redLeft = grid.create_cell_command(2, 1, "red")
    redRight = grid.create_cell_command(5, 0, "red")
    redLeft()                   # (2) Do Red Cells
    redRight.do()               # OR: redRight()
    html.append(grid.as_html("(2) Do Red Cells"))
    greenLeft = grid.create_cell_command(2, 1, "lightgreen")
    greenLeft()                 # (3) Do Green Cell
    html.append(grid.as_html("(3) Do Green Cell"))
    rectangleLeft = grid.create_rectangle_macro(1, 1, 2, 2, "lightblue")
    rectangleRight = grid.create_rectangle_macro(5, 0, 6, 1, "lightblue")
    rectangleLeft()             # (4) Do Blue Squares
    rectangleRight.do()         # OR: rectangleRight()
    html.append(grid.as_html("(4) Do Blue Squares"))
    rectangleLeft.undo()        # (5) Undo Left Blue Square
    html.append(grid.as_html("(5) Undo Left Blue Square"))
    greenLeft.undo()            # (6) Undo Left Green Cell
    html.append(grid.as_html("(6) Undo Left Green Cell"))
    rectangleRight.undo()       # (7) Undo Right Blue Square
    html.append(grid.as_html("(7) Undo Right Blue Square"))
    redLeft.undo()              # (8) Undo Red Cells
    redRight.undo()
    html.append(grid.as_html("(8) Undo Red Cells"))
    print('<table border="0"><tr><td>{}</td></tr></table>'.format(
        "</td><td>".join(html)))

if __name__ == "__main__":
    main()
