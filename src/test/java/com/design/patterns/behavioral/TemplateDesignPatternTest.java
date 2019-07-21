package com.design.patterns.behavioral;

import org.junit.Test;

import com.design.patterns.behavioral.template.GlassHouse;
import com.design.patterns.behavioral.template.HouseTemplate;
import com.design.patterns.behavioral.template.WoodenHouse;

public class TemplateDesignPatternTest {

	@Test
	public void testBuildWoodenHouse() {
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
	}

	@Test
	public void testBuildGlassHouse() {
		HouseTemplate houseType = new GlassHouse();
		houseType.buildHouse();
	}

}
