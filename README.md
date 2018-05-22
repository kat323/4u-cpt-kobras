# 4u-cpt-kobras
An awesome school simulator

CPT UML CAN BE FOUND HERE
https://drive.google.com/file/d/1XImkd3lKZEuy_Xqwi0SWBkSPfnRyidDI/view?usp=sharing





THINGS TO KNOW
locations.txt format: id roomNorth roomEast roomSouth roomWest bgImgName dialogue1 dialogue2 dialogue3 dialogue4

imgList.txt format: id xpos ypos width height imgName

sm.setState is called to change states only in the state classes

State is basically a controller

statically call on the mouse class to check different mouse inputs

statically call Content to retrieve data from the models
ex Content.decisions.get(int id)