import smtplib
import schedule
import time
from datetime import datetime, timedelta
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

# Função para enviar o e-mail
def enviar_email(destinatario, assunto, corpo):
    # Defina as informações da sua conta de e-mail
    remetente = "seuemail@dominio.com"
    senha = "sua_senha"

    # Configura o servidor SMTP
    server = smtplib.SMTP('smtp.dominio.com', 587)
    server.starttls()
    server.login(remetente, senha)

    # Compondo o e-mail
    msg = MIMEMultipart()
    msg['From'] = remetente
    msg['To'] = destinatario
    msg['Subject'] = assunto
    msg.attach(MIMEText(corpo, 'plain'))

    # Envia o e-mail
    server.sendmail(remetente, destinatario, msg.as_string())
    server.quit()

    print("E-mail enviado para", destinatario)

# Função de notificação no dia anterior
def notificar_dia_anterior():
    # Enviar uma notificação de lembrete (exemplo: por e-mail ou log)
    print("Lembrete: Confirmar envio de e-mails para o Dia das Changes amanhã.")
    # Aqui você pode personalizar para enviar um e-mail de notificação
    enviar_email("seuemail@dominio.com", "Lembrete: Confirmar envio de e-mails", "Por favor, confirme se você está pronto para enviar os e-mails amanhã.")

# Função de envio do e-mail no Dia das Chances
def enviar_email_dia_changes():
    # Verifica se o usuário confirmou para o envio
    confirmacao = input("Você está pronto para enviar o e-mail para os clientes? (sim/não): ").strip().lower()
    
    if confirmacao == "sim":
        # Envia o e-mail para o cliente
        enviar_email("cliente@dominio.com", "Dia das Changes - Oportunidade Exclusiva", "Prezado Cliente, temos uma oportunidade exclusiva para você no Dia das Changes!")
    else:
        print("Envio de e-mail cancelado.")
        
# Agendar a notificação para o dia anterior
def agendar_notificacao():
    # Defina a data e hora da notificação (dia anterior)
    data_notificacao = datetime.now() + timedelta(days=-1)
    horario_notificacao = data_notificacao.replace(hour=10, minute=0, second=0, microsecond=0)
    
    # Agendar a tarefa
    schedule.every().day.at(horario_notificacao.strftime("%H:%M")).do(notificar_dia_anterior)

# Agendar o envio de e-mail para o Dia das Chances
def agendar_envio_email():
    # Defina a data e hora para enviar o e-mail (no dia das chances)
    data_envio = datetime.now() + timedelta(days=1)
    horario_envio = data_envio.replace(hour=10, minute=0, second=0, microsecond=0)

    # Agendar o envio de e-mail
    schedule.every().day.at(horario_envio.strftime("%H:%M")).do(enviar_email_dia_changes)

# Função principal para rodar o agendador
def main():
    agendar_notificacao()
    agendar_envio_email()

    while True:
        schedule.run_pending()
        time.sleep(60)  # Espera 1 minuto para a próxima verificação

# Executando o script
if __name__ == "__main__":
    main()
