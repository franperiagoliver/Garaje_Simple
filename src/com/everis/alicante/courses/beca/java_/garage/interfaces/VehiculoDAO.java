package com.everis.alicante.courses.beca.java_.garage.interfaces;

import java.io.IOException;
import java.util.Map;

import com.everis.alicante.courses.beca.java_.garage.domain.Vehiculo;

public interface VehiculoDAO {
	
	Map<String, Vehiculo> readVehiculo() throws IOException;
	
	void createVehiculo();
	
}
