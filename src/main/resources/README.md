### Basic Idea
The idea of the game “Adventures of Blacky” is to build a simple text game.
The game will involve description of current state/room, collecting player input, and reacting to player input.

#### V1 -Text only (questions/answers/information/etc).
NO 2d grids or complex data structures. Our goal is just to get used to program control flow. (if this, else that, etc). The goal of the first game will to come up with a goal. For example, “Blacky wants to get Tuna”. Then Blacky will have to perform tasks in order to get the tuna. Below is a sample flow.

##### Scenario 1
Description: “Blacky just woke up on the bed and is hungry. Kenny and Jing are asleep”
Menu: “What to do:”
Meow
Jump on Jing’s face
Poop on bed
Scratch at closed door

- [ ] If user selects “2”, Jing yells at blacky and goes back to bed.
- [ ] If user selects “3”, Jing wakes up and gets very angry and vows to not give Blacky Tuna for two weeks. Variables Over.
- [ ] If user selects “1”, Kenny keeps snoring, Jing rolls in her sleep. (increment an internal counter of how many times Blacky has meowed”, the more times Blacky meows, the more Jing reacts, until eventually she wakes up.
- [ ] If user selects “4”, If Blacky meow count > 5 and Jing is awake, Jing opens door, else, nothing happens and everyone remains sleeping. Now that the door is open AND Jing is awake, the menu + description changes.

##### Scenario 2
Description: “Jing is now awake, Kenny is still snoring, and the door is open.”
Menu: “What to do:”
Meow
Attack Kenny’s feet
Enter Hallway

- [ ] If user selects “1” AND meow count > 10, Jing gets mad and doesn’t give Tuna, Variables Over. Increase Jing’s anger with every meow so the user knows they are crossing a line.
- [ ] If user selects “2”, Kenny wakes up and pets Blacky, and then goes back to sleep.
- [ ] If user enters “3” Blacky goes into hallway and menu/description changes



##### Scenario 3
Description: “Blacky is now in the hall and Jing says ‘What does blacky want’?”
Menu: “What to do:”
Meow
Do Nothing

- [ ] If user selects “1”, Jing asks “Does blacky want Tuna?” and Menu changes/description changes
- [ ] If user selects “2”, Jing goes back to sleep and Blacky has to meow 3 times to wake her back up (reset meow count counter)

Description: “Jing notices Blacky meowed at Tuna and asks Blacky to meow 3 times if she wants Tuna”
Menu: “What to do:”
Meow
Do Nothing

… etc

_V2 This will also be a text game, but Blacky will have stats like an RPG and we’ll define data structures for the house/rooms. Eventually add in a basic system for handling events Blacky has done, and a battle system, level up system, basic ascii graphics, saving, etc_

_V3 Basic 2D graphics_

##### Basic Examples
- A single file, text based adventure game. Written when helping Steve. (Python) [Link](https://github.com/kennycason/murder_house)


- A simple text based mudd where you can move around within a 2d grid with monsters.[Link](https://gist.github.com/kennycason/303fc008465f3725eb5104109820d117)

- Basic 2D Variables in JS. Not complete and has bugs. But has some decent code layout to see how many things are organized. [Link](https://gist.github.com/kennycason/303fc008465f3725eb5104109820d117)
- Controls, just move around with arrows. Some of the other features seem to be problematic. [Link](http://kennycason.com/games/draconis/ )



##### Minesweeper
This example of Minesweeper is to demonstrate how you can build a text version of a game, then make it with graphics. If you look into the code of both you’ll see overlap of the core logic.

https://github.com/kennycason/minesweeper (no graphics, written in C)
https://github.com/kennycason/minesweeper_libgdx (with graphics, written in Java using LibGDX framework)

##### Advanced 2D Platformer
I’m going to add you to my Ninja Turdle project just so you can see some larger game code.
https://github.com/kennycason/ninjaturdle  (accompanying blog with some, but not much, content: http://ninjaturdle.com/ )

It’s complicated though, there is also a bit of external tooling required. We’ll save this for later.
