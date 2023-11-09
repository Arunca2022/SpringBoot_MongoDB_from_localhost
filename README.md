# SpringBoot_MongoDB_from_localhost
Use below commad for running mango DB in localhost
docker run -d --name mangodb -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=password -p 27017:27017 mongo
