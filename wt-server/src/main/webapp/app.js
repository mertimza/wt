require("load");
require("asynchttp");
docReady(function() {
	httpGetAsync("tasks", function(data, status) {
		var array = JSON.parse(data);
		document.write("<table><tr><td>ID</td><td>Title</td></tr>");
		array.forEach(function(data) {
			document.write("<tr>");
			for ( var key in data) {
				document.write("<td>" + data[key] + "</td>");
			}
			document.write("</tr>");
		});
		document.write("</table>");
	});
});