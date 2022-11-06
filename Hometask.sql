-- TABLES

-- 1. Rooms(7)

	-- ID
	-- type of room (string)
    -- size in m2 (float)
    -- floor (int)
    -- renovated (boolean)
    -- optimal furniture count (int)
    
-- 2. Furniture (15)
	-- ID
	-- type of the furniture (string)
    -- cost (float)
    -- Brand (string)
    -- New (new/used) (Boolean) new -> true /and/ used -> false
    -- Material (string)
    
    
-- 3. Location of furniture (REFERENCE)
	-- RoomID
    -- FurnitureID

-- Queries
	-- 1. Rooms total cost searching by room name (type)
    -- 2. Show all furniture info (type, brand and cost) in particular room searching by room name
    -- 3. how many new furniture is in the room searching by room name
    -- 4. Average room size
    -- 5. List all renovated rooms where there is at least 3 piece of furniture
    -- 6. List room where sum of the furniture cost is more than 1000
    -- 7. show all unique furniture in the room (there could be multiple units of the same furniture in the room)
    -- 8. most popular material for furniture in room searcing by room
    -- 9. list all roomes where there is more than optimal furniture count

-- CREATING ROOMS TABLE    
create table rooms (
	roomID int not null auto_increment,
    roomType varchar(50),
    size float,
    floor int,
    renovated boolean,
    optFurnitureCount int,
    Primary key (roomID)
);
 
-- INSERTING ROOMS INTO TABLE
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('dining room', 10.2, 1, true, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('kitchen', 15.8, 1, false, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('bathroom', 8.9, 2, true, 8);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('bedroom', 20, 2, true, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('cellar', 6.5, 0, false, 6);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('guest bedroom', 11.3, 1, true, 10);
Insert into rooms (roomType, size, floor, renovated, optFurnitureCount) VALUES ('living room', 32.1, 1, false, 15);


-- CREATING FURNITURE TABLE
create table furniture (
	furnitureID int not null auto_increment,
    furnitureType varchar(50),
    cost float,
    brand varchar(50),
    new boolean,
    material varchar(20),
    Primary key (furnitureID)
);

-- INSERTING FURNITURE INTO TABLE (bed, wardrobe, shelves, kitchen cabinet, toilet, bath, sink, armchair, table, chair, sofa, lamp, TV-table, coffee table, bedside table)
Insert into furniture (furnitureType, cost, brand, new, material) values ('bed', 1500, 'Sofaservice', true, 'upholstered');
Insert into furniture (furnitureType, cost, brand, new, material) values ('bed', 500, 'IKEA', true, 'upholstered');
Insert into furniture (furnitureType, cost, brand, new, material) values ('wardrobe', 800, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('wardrobe', 400, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('shelves', 300, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('shelves', 400, 'Elfa', true, 'metal');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('toilet', 300, 'Gustavsberg', true, 'ceramic');
Insert into furniture (furnitureType, cost, brand, new, material) values ('bath', 900, 'Gustavsberg', true, 'ceramic');
Insert into furniture (furnitureType, cost, brand, new, material) values ('sink', 200, 'Villeroy&Boch', true, 'ceramic');
Insert into furniture (furnitureType, cost, brand, new, material) values ('sink', 200, 'Villeroy&Boch', true, 'ceramic');
Insert into furniture (furnitureType, cost, brand, new, material) values ('armchair', 300, 'IKEA', false, 'upholstered');
Insert into furniture (furnitureType, cost, brand, new, material) values ('armchair', 700, 'Softrend', true, 'upholstered');
Insert into furniture (furnitureType, cost, brand, new, material) values ('table', 900, 'Softrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('chair', 200, 'Sofrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('chair', 200, 'Sofrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('chair', 200, 'Sofrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('chair', 200, 'Sofrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('chair', 200, 'Sofrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('chair', 200, 'Sofrend', true, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('sofa', 2500, 'Sofrend', true, 'upholstered');
Insert into furniture (furnitureType, cost, brand, new, material) values ('lamp', 90, 'Airam', true, 'polycarbonate/class');
Insert into furniture (furnitureType, cost, brand, new, material) values ('tv-table', 100, 'Unknown', false, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('coffee table', 70, 'Unknown', false, 'wood');
Insert into furniture (furnitureType, cost, brand, new, material) values ('bedside table', 100, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('bedside table', 100, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('bedside table', 100, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('bedside table', 100, 'IKEA', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');
Insert into furniture (furnitureType, cost, brand, new, material) values ('kitchen cabinet', 100, 'Arens', true, 'MDF');


-- CREATING TABLE FOR FURNITURE LOCATION
CREATE TABLE furnitureLocation(
roid int NOT NULL,
fuid int NOT NULL,
PRIMARY KEY (roid, fuid),
FOREIGN KEY (roid) REFERENCES rooms(roomID),
FOREIGN KEY (fuid) REFERENCES furniture(furnitureID)
);

select * from rooms;
select * from furniture;


-- INSERTING FURNITURE TO ROOMS
-- Dining room
Insert into furnitureLocation (roid, fuid) values (1,9);
Insert into furnitureLocation (roid, fuid) values (1,10);
Insert into furnitureLocation (roid, fuid) values (1,17);
Insert into furnitureLocation (roid, fuid) values (1,18);
Insert into furnitureLocation (roid, fuid) values (1,19);
Insert into furnitureLocation (roid, fuid) values (1,20);
Insert into furnitureLocation (roid, fuid) values (1,21);

-- Kitchen
Insert into furnitureLocation (roid, fuid) values (2,4);
Insert into furnitureLocation (roid, fuid) values (2,24);
Insert into furnitureLocation (roid, fuid) values (2,29);
Insert into furnitureLocation (roid, fuid) values (2,30);
Insert into furnitureLocation (roid, fuid) values (2,31);
Insert into furnitureLocation (roid, fuid) values (2,32);
Insert into furnitureLocation (roid, fuid) values (2,33);
Insert into furnitureLocation (roid, fuid) values (2,34);
Insert into furnitureLocation (roid, fuid) values (2,35);
Insert into furnitureLocation (roid, fuid) values (2,36);
Insert into furnitureLocation (roid, fuid) values (2,37);
Insert into furnitureLocation (roid, fuid) values (2,38);
Insert into furnitureLocation (roid, fuid) values (2,39);
Insert into furnitureLocation (roid, fuid) values (2,40);

-- Bathroom
Insert into furnitureLocation (roid, fuid) values (3,5);
Insert into furnitureLocation (roid, fuid) values (3,6);
Insert into furnitureLocation (roid, fuid) values (3,7);

-- Master bedroom
Insert into furnitureLocation (roid, fuid) values (4,1);
Insert into furnitureLocation (roid, fuid) values (4,2);
Insert into furnitureLocation (roid, fuid) values (4,8);
Insert into furnitureLocation (roid, fuid) values (4,12);
Insert into furnitureLocation (roid, fuid) values (4,15);
Insert into furnitureLocation (roid, fuid) values (4,16);

-- Cellar
Insert into furnitureLocation (roid, fuid) values (5,27);

-- Guest bedroom
Insert into furnitureLocation (roid, fuid) values (6,25);
Insert into furnitureLocation (roid, fuid) values (6,22);
Insert into furnitureLocation (roid, fuid) values (6,23);
Insert into furnitureLocation (roid, fuid) values (6,26);

-- Living room
Insert into furnitureLocation (roid, fuid) values (7,11);
Insert into furnitureLocation (roid, fuid) values (7,13);
Insert into furnitureLocation (roid, fuid) values (7,14);
Insert into furnitureLocation (roid, fuid) values (7,3);
Insert into furnitureLocation (roid, fuid) values (7,28);

select * from furnitureLocation;
select * from rooms;
select * from furniture;

-- QUERYS
-- 1. Rooms total cost searching by room name
SELECT SUM(cost) AS 'room_cost'
FROM furniture 
WHERE furnitureID IN (SELECT fuid FROM furnitureLocation WHERE roid IN (SELECT roomID from rooms WHERE roomType = "living room"));

-- 2. Show all furniture info (type, brand and cost) in particular room searching by room name
SELECT furnitureType, brand, cost
FROM furniture
WHERE furnitureID IN (SELECT fuid FROM furnitureLocation WHERE roid IN (SELECT roomID from rooms WHERE roomType = "cellar"));

-- 3. How many new furniture is in the room searching by room name
SELECT SUM(new)
FROM furniture
WHERE furnitureID IN (SELECT fuid FROM furnitureLocation WHERE roid IN (SELECT roomID from rooms WHERE roomType = "living room"));

select furnitureType, new
from furniture
WHERE furnitureID IN (SELECT fuid FROM furnitureLocation WHERE roid IN (SELECT roomID from rooms WHERE roomType = "living room"));

-- 4. Average room size
SELECT AVG(size)
FROM rooms;


-- 5. List all renovated rooms where there is at least 3 piece of furniture
SELECT rooms.RoomType, COUNT(furnitureLocation.roid), rooms.Renovated
FROM rooms, furniturelocation
WHERE furnitureLocation.roid = rooms.RoomID
GROUP BY furnitureLocation.roid
HAVING COUNT(furnitureLocation.fuid)>2 AND rooms.renovated = true;

-- 6. List room where sum of the furniture cost is more than 1000
SELECT furniture.cost, SUM(furnitureLocation.fuid), rooms.roomType
FROM furniture, furnitureLocation 
WHERE furnitureLocation.fuid = furniture.furnitureID AND furnitureLocation.roid = rooms.roomID
GROUP BY furnitureLocation.fuid
HAVING SUM(furnitureLocation.fuid)>1000;

    