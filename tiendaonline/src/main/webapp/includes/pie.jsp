</main>
<!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    
    <!-- jQuery (necesario para DataTables) -->
    <script src="js/jquery-3.6.0.min.js"></script>
    <!-- DataTables -->
    <script src="js/jquery.dataTables.min.js"></script>
    <!-- DataTables adaptado para Bootstrap -->
    <script src="js/dataTables.bootstrap5.min.js"></script>
    <!-- Activación de DataTables sobre todas las etiquetas table -->
    <script>
		$(document).ready(function() {
			$('table').DataTable();
		});
	</script>
	
	<!-- Script para activar "ojo" en las password -->
    <script src="js/toggle-password.js"></script>
</body>
</html>
