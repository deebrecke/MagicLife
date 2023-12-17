# MagicLife
Final project for Android class: Magic Life counter

This is a scorekeeping app for the game Magic: the Gathering.

The user has two choices of format: Standard or Commander.Once they choose which format, they can choose 2 Player or 4 Player.

If they choose Standard, they start with 20 life. There are buttons to add or subtract life.

If they choose Commander, they start with 40 life. Commander also has buttons to track "commander tax" which increases by two as per rules of this format. While the game does not have any instances where tax goes down, I included a minus button just in case someone accidentally hits the plus button twice. This field cannot go below zero.

The layout is such that the phone could be placed on the table between players sitting across from one another and each player can see their own life total right-side up: the top player(s) is rotated 180 degrees. 
Players can choose to leave the text as Player 1, Player 2, etc. or change it to their own name by long-clicking on the text box which brings up an alert-dialog box to enter their name.
When a player gets down to 5 life, the background behind their life total turns red, and a toast comes up saying "You're getting low on life". When they get to zero, the background turns black and the message "YOU'RE DEAD" appears. There are different layouts for 4 players depending on whether the format is standard or commander.

