battle: Zombie.cpp Human.cpp main.cpp Human.h Zombie.h
	g++ Zombie.cpp Human.cpp main.cpp -o battle -Wall

clean:
	rm -f *.o
