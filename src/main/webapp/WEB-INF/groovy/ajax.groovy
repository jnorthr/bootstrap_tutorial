
log.info "Setting attribute name"

request.setAttribute 'name', "jnorthr"

log.info "Forwarding to the template"

forward '/WEB-INF/pages/ajax.gtpl'