CREATE TABLE `client` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `birthDate` DATE NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `name` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `last` varchar (128) NOT NULL,
  `first` varchar (128) NOT NULL,
  `middle` varchar (128) NOT NULL,
  `client_id` int(10) unsigned,
    FOREIGN KEY (`client_id`) REFERENCES client(id) ON DELETE CASCADE,
  PRIMARY KEY (`id`)
);

CREATE TABLE `address` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar (128) NOT NULL,
  `raw_content` TEXT NOT NULL,
  `client_id` int(10) unsigned,
  FOREIGN KEY (`client_id`) REFERENCES client(id) ON DELETE CASCADE,
  PRIMARY KEY (`id`)
);

CREATE TABLE `document` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar (128) NOT NULL,
  `value` varchar (128) NOT NULL,
  `client_id` int(10) unsigned,
  FOREIGN KEY (`client_id`) REFERENCES client(id) ON DELETE CASCADE,
  PRIMARY KEY (`id`)
);