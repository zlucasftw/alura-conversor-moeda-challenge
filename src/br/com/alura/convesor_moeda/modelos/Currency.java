package br.com.alura.convesor_moeda.modelos;

public record Currency(int time_last_update_unix, String time_last_update_utc, String base_code, String target_code,
                       double conversion_rate, double conversion_result) {
}
