<h1>Compte Rendu : "Full Banking Project"</h1>
<h2>Partie 1 : Front-End</h2>
<h3>la liste des produits :</h3>
<img src="Screenshots/frontend-products.png">
<h3>la liste des clients :</h3>
<img src="Screenshots/frontend-customers.png">
<h3>Chaque client contient une liste des ordres (bouton vert):</h3>
<img src="Screenshots/frontend-orders.png">
<h3>Cette page contient les details de chaque ordre</h3>
<img src="Screenshots/frontend-orderDetails.png">
<h3>Pour configurer CORS dans la gateway-service</h3>
<img src="Screenshots/CORS.png">
<h2>Partie 2: Back-End</h2>
<h3>Les services sont enregistrés dans Consul :</h3>
<img src="Screenshots/backend-consul.png">
<h3>1)-Consul Config</h3>
<p>Pour utiliser Concul Config il faut tout d'abord ajouter la dependance suivante :</p>
<img src="Screenshots/consul-dependency.png">
<p>L'interface Concul où on a enregistrer notre configuration :</p>
<img src="Screenshots/backend-consul-tokens.png">
<p>Pour utiliser la configuration dans chaque microservice on doit l'importer :</p>
<img src="Screenshots/customers-properties1.png">
<img src="Screenshots/customers-properties2.png">
<p>Et pour tester si la config est bien importé on utilise une class RestController</p>
<img src="Screenshots/restController.png">
<h3>2) Vault Config</h3>
<p>Pour utiliser Vault Config il faut tout d'abord ajouter la dependance suivante :</p>
<img src="Screenshots/vault-dependency.png">
<p>L'interface Vault où on a enregistrer notre configuration :</p>
<img src="Screenshots/backend-vault-keys.png">
<p>Pour utiliser la configuration dans chaque microservice on doit la configurer et l'importer :</p>
<img src="Screenshots/properties-billing.png">
<p>Et pour tester si la config est bien importé on utilise une class RestController</p>
<img src="Screenshots/MyConsulConfig.png">
<img src="Screenshots/MyVaultConfig.png">
<img src="Screenshots/ConsulConfigRestController.png">
