# Definir a data de envio
$hoje = Get-Date
$dataEnvio = $hoje.AddDays(1)  # Configura o envio para amanhã
$dataNotificacao = $hoje.AddDays(-1)  # Configura a notificação para o dia anterior

# Definir a função para enviar o e-mail de notificação
Function EnviarNotificacao {
    $emailPara = "seuemail@dominio.com"  # Substitua pelo seu e-mail
    $assunto = "Lembrete: Confirmar envio de e-mails"
    $corpo = "Olá! Este é um lembrete para confirmar o envio dos e-mails para o Dia das Changes amanhã."
    
    Send-MailMessage -From "seuemail@dominio.com" -To $emailPara -Subject $assunto -Body $corpo -SmtpServer "smtp.dominio.com" # Altere para o servidor SMTP
}

# Verificar se a data atual é o dia de notificação
if ($hoje.Date -eq $dataNotificacao.Date) {
    EnviarNotificacao  # Enviar a notificação
}

# Função para enviar o e-mail principal no "Dia das Chances"
Function EnviarEmailDiaDasChanges {
    $emailPara = "cliente@dominio.com"  # Substitua pelo e-mail do cliente
    $assunto = "Dia das Changes - Oportunidade Exclusiva"
    $corpo = "Prezado Cliente, temos uma oportunidade exclusiva para você neste Dia das Changes."

    Send-MailMessage -From "seuemail@dominio.com" -To $emailPara -Subject $assunto -Body $corpo -SmtpServer "smtp.dominio.com" # Altere para o servidor SMTP
}

# Verificar se é o dia de envio e enviar o e-mail
if ($hoje.Date -eq $dataEnvio.Date) {
    EnviarEmailDiaDasChanges  # Enviar o e-mail para o cliente
}
