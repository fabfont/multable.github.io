REGISTRY=registry.gitlab.com/datamea
GCP_REGISTRY=gcr.io/${PROJECT_ID}
IMAGE_NAME=ui
IMAGE_VERSION=latest

start: 
	yarn start

docker:
	docker build -t $(REGISTRY)/$(IMAGE_NAME):$(IMAGE_VERSION) .

docker-build-outside:
	yarn install
	yarn build --frozen-lockfile --no-cache --production
	docker build -f DockerfileLocal -t $(REGISTRY)/$(IMAGE_NAME):$(IMAGE_VERSION) .

docker-gcp:
	yarn install
	yarn build --frozen-lockfile --no-cache --production
	docker build -f DockerfileLocal -t $(GCP_REGISTRY)/$(IMAGE_NAME):$(IMAGE_VERSION) .
