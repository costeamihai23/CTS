package ro.ase.cts.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GrupaFixtureTests.class, SuiteTeste.class, TestGrupa.class, TestGrupaWithMocks.class })
public class SuiteCustom {

}
