package injectFuel;

import injectFuel.car.Avante;
import injectFuel.car.K5;
import injectFuel.car.Sonata;
import org.junit.jupiter.api.Test;

class RentCompanyTest {

    @Test
    void rentCompanyCarTest() {

        RentCompany company = RentCompany.create();
        company.addCar(new Sonata(100));
        company.addCar(new Sonata(130));
        company.addCar(new K5(50));
        company.addCar(new K5(60));
        company.addCar(new Avante(130));

        //rentCompany.addCar();
        System.out.println(company.generateReport());

    }

}
