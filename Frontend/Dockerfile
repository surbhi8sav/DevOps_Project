FROM node:18.13.0-alpine as builder

# Set working directory for all build stages.
WORKDIR /app

# Copy the rest of the source files into the image.
COPY . .

RUN npm install
# Run the build script.
RUN npm run build --prod

FROM nginx:alpine
COPY src/nginx/etc/conf.d/default.conf /etc/nginx/conf/default.conf
COPY --from=builder app/dist/devops_frontend usr/share/nginx/html
EXPOSE 80
