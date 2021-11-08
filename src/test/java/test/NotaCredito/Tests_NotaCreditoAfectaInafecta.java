package test.NotaCredito;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.Configuration;
import common.LeerExcel;
import pages.PageAgregarPropiedadesAdicionales;
import pages.PageDatosEmision;
import pages.PageDetalle;
import pages.PageFooter;
import pages.PageLogin;
import pages.PageReceptor;
import pages.PageReferencias;
import pages.PageSeleccionCpe;

public class Tests_NotaCreditoAfectaInafecta {
	private WebDriver driver;
	String datapool = Configuration.ROOT_DIR+"DataPool_v2.xlsx";
	LeerExcel leerExcel = new LeerExcel();
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException {
//		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://escritorio-qa.acepta.pe/");// Aqu� se ingresa la URL para hacer las pruebas.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Script_0065() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0065
		String cp = "EAP_0065";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);
		
		PageReferencias pageReferencias = new PageReferencias(driver);
		pageReferencias.folioReferencia(datos[6],datos[7], cp);
		
		PageDetalle pageDetalle = new PageDetalle(driver);
//		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
//		pageDetalle.botonAgregarProductosdivTreintayUno(cp);
		pageDetalle.itemNoAfecto(cp);
		pageDetalle.completarDetalleProductos2(cp, datos[8], datos[9]);//Se Agrega copia de m�todo Detalle Producto
		pageDetalle.botonAgregarProductosdivTreintayUno(cp);
		
		PageAgregarPropiedadesAdicionales PageAgregarPropiedadesAdicionales = new PageAgregarPropiedadesAdicionales(driver);
		PageAgregarPropiedadesAdicionales.agregarItem(cp);
		PageAgregarPropiedadesAdicionales.clickAgregar();
		
		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0066() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0066
		String cp = "EAP_0066";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);
		
		PageReferencias pageReferencias = new PageReferencias(driver);
		pageReferencias.folioReferencia(datos[6],datos[7], cp);
		
		PageDetalle pageDetalle = new PageDetalle(driver);
		pageDetalle.itemNoAfecto(cp);
//		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.completarDetalleProductos2(cp, datos[8], datos[9]);//Se Agrega copia de m�todo Detalle Producto
		pageDetalle.itemconIcbper(cp);
		pageDetalle.botonAgregarProductosdivTreintayUno(cp);
		
		PageAgregarPropiedadesAdicionales PageAgregarPropiedadesAdicionales = new PageAgregarPropiedadesAdicionales(driver);
		PageAgregarPropiedadesAdicionales.agregarItem(cp);
		PageAgregarPropiedadesAdicionales.clickAgregar();
		
		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0067() throws InterruptedException, FileNotFoundException, InvalidFormatException, IOException {
//		EAP_0067
		String cp = "EAP_0067";
		System.out.println(cp);

		PageLogin pageLogin = new PageLogin(driver);
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		pageLogin.login(datos[1], datos[2]);
		
		PageSeleccionCpe pageSeleccionCpe = new PageSeleccionCpe(driver);
		pageSeleccionCpe.clickEmisionExpress(cp);
		pageSeleccionCpe.seleccionTipoCpe(datos[3], cp);
		pageSeleccionCpe.seleccionSubtipoCpe(datos[4], cp);
		
		PageDatosEmision pageDatosEmision = new PageDatosEmision(driver);
		pageDatosEmision.completarDatosEmision(cp);
		
		PageReceptor pageReceptor = new PageReceptor(driver);
		pageReceptor.completarReceptor(cp);
		
		PageReferencias pageReferencias = new PageReferencias(driver);
		pageReferencias.folioReferencia(datos[6],datos[7], cp);
		
		PageDetalle pageDetalle = new PageDetalle(driver);
//		pageDetalle.completarDetalleProductos(cp, datos[8], datos[9]);
		pageDetalle.completarDetalleProductos2(cp, datos[8], datos[9]);//Se Agrega copia de m�todo Detalle Producto
		pageDetalle.isc(cp);
		pageDetalle.botonAgregarProductosdivTreintayUno(cp);
		
		PageAgregarPropiedadesAdicionales PageAgregarPropiedadesAdicionales = new PageAgregarPropiedadesAdicionales(driver);
		PageAgregarPropiedadesAdicionales.agregarItem(cp);
		PageAgregarPropiedadesAdicionales.clickAgregar();
		
		PageFooter pageFooter = new PageFooter(driver);
		pageFooter.clickPrevisualizacion(cp);
		pageFooter.clickEnviaraSunat(cp);
		
		System.out.println("FLUJO OK");
	}
	
	@AfterMethod
	public void FinEjecucion() {
		driver.close();
	}
}