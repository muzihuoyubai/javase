#include <stdio.h>
#include <stdlib.h>

struct Elephant {
    int heightInCM;
};

struct Tiger {
    int heightInCM;
};

struct Lion {
    int heightInCM;
};

struct Fridge {
    int heightInCM;
    struct Elephant *storage;
};

struct Elephant* createElephant(int heightInCM) {
    printf("创建一个大象，高度%d厘米\n", heightInCM);
    struct Elephant* elephant = malloc(sizeof(struct Elephant));
    elephant->heightInCM = heightInCM;
    return elephant;
}

struct Fridge* createFridge(int heightInCM) {
    printf("创建一个冰箱，高度%d厘米\n", heightInCM);
    struct Fridge* fridge = malloc(sizeof(struct Fridge));
    fridge->heightInCM = heightInCM;
    fridge->storage = NULL;
    return fridge;
}

void putInElephant(struct Elephant *elephant, struct Fridge *fridge) {
    printf("把%d厘米高的大象装进%d厘米高的冰箱\n", elephant->heightInCM, fridge->heightInCM);
    if(elephant->heightInCM < fridge->heightInCM) {
      fridge->storage = elephant;
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge->storage->heightInCM);
    } else {
      System.out.printf("冰箱装不下!\n");
    }
    
}

void putInLion(struct Lion *lion, struct Fridge *fridge) {
    printf("把%d厘米高的狮子装进%d厘米高的冰箱\n", elephant->heightInCM, fridge->heightInCM);
    if(elephant->heightInCM < fridge->heightInCM) {
      fridge->storage = elephant;
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge->storage->heightInCM);
    } else {
      System.out.printf("冰箱装不下!\n");
    }
    
}

void putInLion(struct Tiger *tiger, struct Fridge *fridge) {
    printf("把%d厘米高的老虎装进%d厘米高的冰箱\n", elephant->heightInCM, fridge->heightInCM);
    if(elephant->heightInCM < fridge->heightInCM) {
      fridge->storage = elephant;
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge->storage->heightInCM);
    } else {
      System.out.printf("冰箱装不下!\n");
    }
    
}

int main(void) {
    struct Elephant* elephant = createElephant(300);
    struct Fridge* fridge = createFridge(500);
    putInElephant(elephant, fridge);
    fridge->elephant->heightInCM = 14;
}