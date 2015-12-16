function require(target, callback) {
	var script = document.createElement('script');
	script.src = "app/" + target + '.js';
	script.type = 'text/javascript';

	script.onload = function() {
		if (callback instanceof Function) {
			callback();
		}
	};

	document.getElementsByTagName('head')[0].appendChild(script);
}