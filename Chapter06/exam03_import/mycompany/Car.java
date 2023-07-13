package Chapter06.exam03_import.mycompany;

import Chapter06.exam03_import.kumho.*;
import Chapter06.exam03_import.hankook.*;
import Chapter06.exam03_import.hyndai.Engine;

public class Car {

    // 필드
    Engine engine = new Engine();
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();

    Chapter06.exam03_import.hankook.Tire tire3 = new Chapter06.exam03_import.hankook.Tire();
    Chapter06.exam03_import.kumho.Tire tire4 = new Chapter06.exam03_import.kumho.Tire();
}
