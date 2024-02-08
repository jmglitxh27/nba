-- Table to create an entire team
CREATE TABLE Team(
tid int NOT NULL AUTO_INCREMENT,
tname varchar(30),
tstate varchar(30),
tcity varchar(40),
PRIMARY KEY (tid)
);

-- Table that creates the individual player
CREATE TABLE Player(
pid int NOT NULL AUTO_INCREMENT,
fname varchar(35) NOT NULL,
lname varchar(35) NOT NULL,
dob DATE NOT NULL,
pcollege varchar(50) NOT NULL,
pjersey int NOT NULL,
ppos varchar(30) NOT NULL,
tid int,
FOREIGN KEY (tid) REFERENCES team(tid),
PRIMARY KEY (pid)
);

-- Table that will be used to give the player stats after games
CREATE TABLE Stats(
gid int NOT NULL AUTO_INCREMENT,
timeplayed float NOT NULL,
points int,
rebounds int,
assists int,
steals int,
blocks int,
pid int,
FOREIGN KEY(pid) REFERENCES player(pid),
PRIMARY KEY(gid)
);


-- Some teams to be put into the Team table
INSERT INTO Team(tname, tstate, tcity)
VALUES('Hawks', 'Georgia', 'Atlanta');

INSERT INTO Team(tname, tstate, tcity)
VALUES('Celtics', 'Massachusettes', 'Boston');

INSERT INTO Team(tname, tstate, tcity)
VALUES('Cavaliers', 'Ohio', 'Cleveland');

INSERT INTO Team(tname, tstate, tcity)
VALUES('Nuggets', 'Colorado', 'Denver');

INSERT INTO Team(tname, tstate, tcity)
VALUES('Warriors', 'California', 'Golden State');


INSERT INTO Team(tname, tstate, tcity)
VALUES('Mavericks', 'Texas', 'Dallas');



-- Some players to be assigned to the teams
INSERT INTO Player(fname, lname, dob, pcollege, pjersey, ppos, tid)
VALUES('Trae', 'Young', '1998-09-19', 'Oklahoma', 11, 'Point Guard', 1);

INSERT INTO Player(fname, lname, dob, pcollege, pjersey, ppos, tid)
VALUES('Bogdan', 'Bogdanovic', '1992-08-18', 'Serbia', 13, 'Shooting Guard', 1);

INSERT INTO Player(fname, lname, dob, pcollege, pjersey, ppos, tid)
VALUES('Jayson', 'Tatum', '1998-03-03', 'Duke', 0, 'Small Forward', 2);

INSERT INTO Player(fname, lname, dob, pcollege, pjersey, ppos, tid)
VALUES('Jaylen', 'Brown', '1996-10-24', 'California', 7, 'Shooting Guard', 2);

INSERT INTO Player(fname, lname, dob, pcollege, pjersey, ppos, tid)
VALUES('Kyrie', 'Irving', '1992-03-23', 'Duke', 11, 'Point Guard', 6);


-- Sample SQL query to retrieve the state name of where the Hawks players play using Player table
SELECT DISTINCT t.tstate AS 'State' FROM Team t, Player p WHERE t.tid = p.tid AND p.tid = 1;